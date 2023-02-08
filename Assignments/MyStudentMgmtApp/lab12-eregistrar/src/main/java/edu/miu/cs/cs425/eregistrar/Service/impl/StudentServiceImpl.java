package edu.miu.cs.cs425.eregistrar.Service.impl;

import edu.miu.cs.cs425.eregistrar.Service.StudentService;
import edu.miu.cs.cs425.eregistrar.model.Student;
import edu.miu.cs.cs425.eregistrar.repository.StudentRepository;
import edu.miu.cs.cs425.eregistrar.repository.TranscriptRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private TranscriptRepository transcriptRepository;

    @Override
    public Student saveStudent(Student student) {
        return  studentRepository.save(student);
    }

    @Override
    public List<Student> getAllStudent() {
        return studentRepository.findAll();
    }

    @Override
    public Student getStudentById(Integer studentId) {
        return studentRepository.findById(studentId).orElse(null);
    }

    @Override
    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }

    public void deleteStudentById(Integer studentId){
        studentRepository.deleteById(studentId);
    }

    public void deleteTranscriptOfStudent(Integer studentId) {
        var student = studentRepository.findById(studentId).orElse(null);
        if(student != null) {
            var transcript = student.getTranscript();
            Integer transcriptId = null;
            if(transcript != null) {
                transcriptId = transcript.getTranscriptId();
            }
            student.setTranscript(null);
            studentRepository.save(student);
            if(transcriptId != null) {
                transcriptRepository.deleteById(transcriptId);
            }
        }
    }

    @Override
    public Page<Student> getAllStudentsPaged(int pageNo) {
        return studentRepository.findAll(
                PageRequest.of(pageNo,
                        3,
                        Sort.by(Sort.Direction.ASC, "firstName"))
        );
    }

    @Override
    public List<Student> searchStudents(String search) {
        return studentRepository.findStudentByStudentNumberAndFirstNameContainingAndLastNameContaining(search, search, search);
    }


}
