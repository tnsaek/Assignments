package edu.miu.cs.cs425.studentmgmt;

import edu.miu.cs.cs425.studentmgmt.Service.ClassroomService;
import edu.miu.cs.cs425.studentmgmt.Service.CourseService;
import edu.miu.cs.cs425.studentmgmt.Service.StudentService;
import edu.miu.cs.cs425.studentmgmt.Service.TranscriptService;
import edu.miu.cs.cs425.studentmgmt.model.Classroom;
import edu.miu.cs.cs425.studentmgmt.model.Course;
import edu.miu.cs.cs425.studentmgmt.model.Student;
import edu.miu.cs.cs425.studentmgmt.model.Transcript;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Lap9StudentMgmtAppApplication implements CommandLineRunner {

    @Autowired
    private StudentService studentService;
    @Autowired
    private TranscriptService transcriptService;
    @Autowired
    private ClassroomService classroomService;
    @Autowired
    private CourseService courseService;

    public static void main(String[] args) {
        SpringApplication.run(Lap9StudentMgmtAppApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {

//        Student s1 = new Student(1l,"000-61-0001", "Anna", "Lynn", "Smith",
//                3.45, 2019, 05, 24);

//        System.out.println(addStudent(s1));
//
//
//        Transcript t1 = new Transcript(1l, "BS Computer Science");
//        t1.setStudent(s1);
//        s1.setTranscript(t1);
//
//        System.out.println(addTranscript(t1));
//        System.out.println(addStudent(s1));
//
//        Classroom cr1 = new Classroom(1l, "McLaughlin building", "M105");
//        s1.setClassroom(cr1);
//
//        System.out.println(addClassroom(cr1));
//        System.out.println(addStudent(s1));
//
//        Course c1 = new Course(1, "CS425", "Software engineering");
//        Course c2 = new Course(2, "CS544", "Enterprise Architectuer");
//        List<Course> courses = new ArrayList<>();
//        courses.add(c1);
//        courses.add(c2);
//        s1.setCourses(courses);
//
//        System.out.println(addCourse(c1));
//        System.out.println(addCourse(c2));
//        System.out.println(addStudent(s1));

    }

    private Student addStudent(Student student){
        return studentService.saveStudent(student);
    }

    private Transcript addTranscript(Transcript transcript){
        return transcriptService.saveTranscript(transcript);
    }

    private Classroom addClassroom(Classroom classroom){
        return classroomService.saveClassroom(classroom);
    }

    private Course addCourse(Course course){
        return courseService.saveCourse(course);
    }
}

