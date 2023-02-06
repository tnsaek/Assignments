package edu.miu.cs.cs425.studentmgmt.Service.impl;

import edu.miu.cs.cs425.studentmgmt.Service.StudentService;
import edu.miu.cs.cs425.studentmgmt.model.Student;
import edu.miu.cs.cs425.studentmgmt.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student saveStudent(Student student) {
        return  studentRepository.save(student);
    }
}
