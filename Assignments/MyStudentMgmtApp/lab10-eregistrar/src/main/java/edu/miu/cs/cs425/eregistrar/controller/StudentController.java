package edu.miu.cs.cs425.eregistrar.controller;

import edu.miu.cs.cs425.eregistrar.Service.StudentService;
import edu.miu.cs.cs425.eregistrar.model.Student;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;


    @GetMapping(value = {"/student/list"})
    public ModelAndView listStudents(@RequestParam(defaultValue = "0") int pageNo) {
        var modelAndView = new ModelAndView();
        var students = studentService.getAllStudentsPaged(pageNo);
        modelAndView.addObject("students", students);
        modelAndView.addObject("currentPageNo", pageNo);
//        modelAndView.addObject("publishersCount", ((List)publishers).size());
        modelAndView.setViewName("secured/student/list");
        return modelAndView;
    }

    @GetMapping(value = "/new")
    public String displayNewStudentForm(Model model){
        model.addAttribute("student",new Student());
        return "secured/student/new";
    }

    @PostMapping(value = {"/new"})
    public String registerNewStudent(@Valid @ModelAttribute("student") Student student,
                                       BindingResult bindingResult, Model model) {
        if(bindingResult.hasErrors()) {
            model.addAttribute("student", student);
            model.addAttribute("errors", bindingResult.getAllErrors());
            return "secured/student/new";
        }
        if(student.getTranscript() != null) {
            var transcript = student.getTranscript();
            if(transcript.getDegreeTitle().equals("")) {
                student.setTranscript(null);
            }
        }
        studentService.saveStudent(student);
        return "redirect:/student/list";
    }

    @GetMapping(value = {"/edit/{studentId}"})
    public String editStudent(@PathVariable Integer studentId, Model model) {
        var student = studentService.getStudentById(studentId);
        if(student != null) {
            model.addAttribute("student", student);
            return "secured/student/edit";
        }
        return "redirect:/student/list";
    }

    @PostMapping(value = {"/update"})
    public String updateStudent(@Valid @ModelAttribute("student") Student student,
                                  BindingResult bindingResult, Model model) {
        if(bindingResult.hasErrors()) {
            model.addAttribute("student", student);
            model.addAttribute("errors", bindingResult.getAllErrors());
            return "secured/student/edit";
        }
        studentService.updateStudent(student);
        return "redirect:/student/list";
    }

    @GetMapping(value = {"/delete/{studentId}"})
    public String deleteStudent(@PathVariable Integer studentId) {
        studentService.deleteStudentById(studentId);
        return "redirect:/student/list";
    }


    @GetMapping(value = {"/delete/transcript/{studentId}"})
    public String deleteTranscriptOfStudent(@PathVariable Integer studentId) {
        studentService.deleteTranscriptOfStudent(studentId);
        return "redirect:/student/list";
    }

    @GetMapping(value = {"/search"})
    public String displaySearch(){
        return "secured/student/search";
    }

    @GetMapping(value = {"/student/search"})
    public ModelAndView searchStudents(@RequestParam String searchString) {
        var modelAndView = new ModelAndView();
        var students = studentService.searchStudents(searchString);
        modelAndView.addObject("studentss", students);
        modelAndView.addObject("searchString", searchString);
        modelAndView.setViewName("secured/student/searchlist");
        return modelAndView;
    }


}
