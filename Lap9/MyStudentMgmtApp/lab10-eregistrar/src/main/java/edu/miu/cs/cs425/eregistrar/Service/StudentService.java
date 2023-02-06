package edu.miu.cs.cs425.eregistrar.Service;

import edu.miu.cs.cs425.eregistrar.model.Student;
import org.springframework.data.domain.Page;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    public Student saveStudent (Student student);
    public List<Student> getAllStudent();
    public Student getStudentById(Integer studentId);
    public Student updateStudent(Student student);
    public void deleteStudentById(Integer studentId);
    public void deleteTranscriptOfStudent(Integer studentId);
    public Page<Student> getAllStudentsPaged(int pageNo);
    public List<Student> searchStudents(String search);
}
