package edu.miu.cs.cs425.eregistrarwebapi.service.impl;

import edu.miu.cs.cs425.eregistrarwebapi.dto.StudentDto;
import edu.miu.cs.cs425.eregistrarwebapi.exception.StudentNotFoundException;
import edu.miu.cs.cs425.eregistrarwebapi.mapper.StudentMapper;
import edu.miu.cs.cs425.eregistrarwebapi.model.Student;
import edu.miu.cs.cs425.eregistrarwebapi.repository.StudentRepository;
import edu.miu.cs.cs425.eregistrarwebapi.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;
//    @Autowired
//    private StudentMapper studentMapper;

    @Override
    public List<Student> getAllStudents() {
        List<Student> students = studentRepository.findAll();
        return students;
    }

    @Override
    public Student registerStudent(StudentDto studentDto) {
        var student = Student.build(null, studentDto.getStudentNumber(), studentDto.getFirstName(),
                studentDto.getMiddleName(), studentDto.getLastName(), studentDto.getCpga(),
                studentDto.getEnrollmentDate(), studentDto.getIsInternational());
        return studentRepository.save(student);
    }

    @Override
    public Student getStudentById(Integer studentId) throws StudentNotFoundException {
        return studentRepository.findById(studentId)
                .orElseThrow(() -> new StudentNotFoundException(String.format
                        ("Publisher with ID: %d, is not found", studentId)));
    }

    @Override
    public Student updateStudent(Integer studentId, StudentDto studentDto) {
        Student updatedStudent = Student.build(studentId, studentDto.getStudentNumber(), studentDto.getFirstName(),
                studentDto.getMiddleName(), studentDto.getLastName(), studentDto.getCpga(),
                studentDto.getEnrollmentDate(), studentDto.getIsInternational());
        return studentRepository.save(updatedStudent);
    }

    @Override
    public void deleteStudentById(Integer studentId) {
        studentRepository.deleteById(studentId);
    }







//    public List<StudentDto> getAllStudents(){
//        List<Student> students = studentRepository.findAll();
//        List<StudentDto> studentDtos = studentMapper.studentDtosFromStudents(students);
//        return studentDtos;
//    }
//    public StudentDto registerStudent(StudentDto studentDto){
//        Student student = studentMapper.studentFromStudentDto(studentDto);
//        studentRepository.save(student);
//        return studentDto;
//    }
//    public StudentDto getStudentById(Integer studentId){
//        Student student = studentRepository.findById(studentId).get();
//        StudentDto studentDto = studentMapper.studentDtoFromStudent(student);
//        return  studentDto;
//    }
//    public StudentDto updateStudent(Integer studentId, StudentDto studentDto){
//        Student student = studentMapper.studentFromStudentDto(studentDto);
//        studentRepository.save(student);
//        return studentDto;
//    }
//    public void deleteStudentById(Integer studentId){
//        studentRepository.deleteById(studentId);
//    }
}
