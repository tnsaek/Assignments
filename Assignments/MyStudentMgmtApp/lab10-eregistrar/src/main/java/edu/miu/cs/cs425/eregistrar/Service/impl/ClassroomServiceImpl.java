package edu.miu.cs.cs425.eregistrar.Service.impl;

import edu.miu.cs.cs425.eregistrar.Service.ClassroomService;
import edu.miu.cs.cs425.eregistrar.model.Classroom;
import edu.miu.cs.cs425.eregistrar.repository.ClassroomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClassroomServiceImpl implements ClassroomService {

    @Autowired
    private ClassroomRepository classroomRepository;

    @Override
    public Classroom saveClassroom(Classroom classroom) {
        return classroomRepository.save(classroom);
    }

}
