package edu.miu.cs.cs425.eregistrarwebapi.service;

import edu.miu.cs.cs425.eregistrarwebapi.dto.StudentDto;
import edu.miu.cs.cs425.eregistrarwebapi.exception.StudentNotFoundException;
import edu.miu.cs.cs425.eregistrarwebapi.model.Student;

import java.util.List;

public interface StudentService {
    public List<Student> getAllStudents();
    public Student registerStudent(StudentDto studentDto);
    public Student getStudentById(Integer studentId) throws StudentNotFoundException;
    public Student updateStudent(Integer studentId, StudentDto studentDto);
    public void deleteStudentById(Integer studentId);

}
