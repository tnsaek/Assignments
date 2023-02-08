package edu.miu.cs.cs425.studentmgmt.Service.impl;

import edu.miu.cs.cs425.studentmgmt.Service.CourseService;
import edu.miu.cs.cs425.studentmgmt.model.Course;
import edu.miu.cs.cs425.studentmgmt.repository.CourseRepository;
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
