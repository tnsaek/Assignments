package edu.miu.cs.cs425.eregistrar.Service.impl;

import edu.miu.cs.cs425.eregistrar.Service.CourseService;
import edu.miu.cs.cs425.eregistrar.model.Course;
import edu.miu.cs.cs425.eregistrar.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseRepository courseRepository;
    @Override
    public Course saveCourse(Course course) {
        return courseRepository.save(course);
    }

}
