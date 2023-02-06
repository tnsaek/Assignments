package edu.miu.cs.cs425.eregistrarwebapi.controller;

import edu.miu.cs.cs425.eregistrarwebapi.dto.StudentDto;
import edu.miu.cs.cs425.eregistrarwebapi.exception.StudentNotFoundException;
import edu.miu.cs.cs425.eregistrarwebapi.service.StudentService;
import edu.miu.cs.cs425.eregistrarwebapi.service.impl.StudentServiceImpl;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import edu.miu.cs.cs425.eregistrarwebapi.model.Student;

import java.util.List;

@RestController
@RequestMapping("/eregistrar/api/v1/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping( "/list")
    public ResponseEntity<List<Student>> getAllStudents(){
        return ResponseEntity.ok(studentService.getAllStudents());
    }

    @PostMapping("/register")
    public ResponseEntity<?> addStudent(@Valid @RequestBody StudentDto studentDto){
        return new ResponseEntity<>(studentService.registerStudent(studentDto),
                HttpStatus.CREATED);
    }

    @GetMapping( "/get/{studentId}")
    public ResponseEntity<Student> getStudent(@PathVariable Integer studentId) throws StudentNotFoundException {
        return ResponseEntity.ok(studentService.getStudentById(studentId));
    }

    @PutMapping("/update/{studentId}")
    public ResponseEntity<Student> updateStudent(@PathVariable Integer studentId, @Valid @RequestBody StudentDto studentDto){
            return new ResponseEntity<>(studentService.updateStudent(studentId, studentDto),
                    HttpStatus.OK);
    }

    @DeleteMapping("/delete/{studentId}")
    public ResponseEntity<StudentDto> deleteStudent(@PathVariable Integer studentId){
        studentService.deleteStudentById(studentId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }








//    @GetMapping
//    public List<StudentDto> getAllAcademicBlocks() {
//        List<StudentDto> studentDtos = studentService.getAllStudents();
//        return studentDtos;
//    }
//
//    @PostMapping
//    public ResponseEntity<?> addStudent(@RequestBody StudentDto studentDto) {
//        studentService.registerStudent(studentDto);
//        return new ResponseEntity<>(studentDto, HttpStatus.OK);
//    }
//    @GetMapping("/{id}")
//    public ResponseEntity<?> getStudentById(@PathVariable Integer studentId) {
//        StudentDto studentDto = studentService.getStudentById(studentId);
//        return new ResponseEntity<StudentDto>(studentDto, HttpStatus.OK);
//    }
//    @PutMapping("/{id}")
//    public ResponseEntity<?> updateStudent(@PathVariable Integer studentId, @RequestBody StudentDto studentDto) {
//        studentService.updateStudent(studentId, studentDto);
//        return new ResponseEntity<StudentDto>(studentDto, HttpStatus.OK);
//    }
//    @DeleteMapping("/{id}")
//    public ResponseEntity<?> dropStudent(@PathVariable Integer studentId) {
//        studentService.deleteStudentById(studentId);
//        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//    }
}
