package edu.miu.cs.cs425.studentmgmt.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentId;
    @NotBlank
    @Column(nullable = false)
    private String studentNumber;
    @NotBlank
    @Column(nullable = false)
    private String firstName;
    private String middleName;
    @NotBlank
    @Column(nullable = false)
    private String lastName;
    private double cpga;
    @DateTimeFormat(pattern = "yyyy-mm-dd")
    private LocalDate dateOfEnrollment;
    @OneToOne
    @JoinColumn(name = "transcript_id")
    private Transcript transcript;
    @ManyToOne
    @JoinColumn(name = "classroom_id")
    private Classroom classroom;
    @ManyToMany
    @JoinTable(name = "students_courses",
    joinColumns = {@JoinColumn(name = "students_id", referencedColumnName = "studentId")},
    inverseJoinColumns = {@JoinColumn(name = "courses_id", referencedColumnName = "courseId")})
    private List<Course> courses;


//    public Student(Long studentId, String studentNumber, String firstName, String middleName, String lastName,
//                   double cpga, int year, int month, int dayOfMonth) {
//        this.studentId = studentId;
//        this.studentNumber = studentNumber;
//        this.firstName = firstName;
//        this.middleName = middleName;
//        this.lastName = lastName;
//        this.cpga = cpga;
//        this.dateOfEnrollment = LocalDate.of(year, month, dayOfMonth);
//    }
//
//    public Student() {
//    }

//    public Long getStudentId() {
//        return studentId;
//    }
//
//    public void setStudentId(Long studentId) {
//        this.studentId = studentId;
//    }
//
//    public String getStudentNumber() {
//        return studentNumber;
//    }
//
//    public void setStudentNumber(String studentNumber) {
//        this.studentNumber = studentNumber;
//    }
//
//    public String getFirstName() {
//        return firstName;
//    }
//
//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }
//
//    public String getMiddleName() {
//        return middleName;
//    }
//
//    public void setMiddleName(String middleName) {
//        this.middleName = middleName;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }
//
//    public double getCpga() {
//        return cpga;
//    }
//
//    public void setCpga(double cpga) {
//        this.cpga = cpga;
//    }
//
//    public LocalDate getDateOfEnrollment() {
//        return dateOfEnrollment;
//    }
//
//    public void setDateOfEnrollment(LocalDate dateOfEnrollment) {
//        this.dateOfEnrollment = dateOfEnrollment;
//    }
//
//    public Transcript getTranscript() {
//        return transcript;
//    }
//
//    public void setTranscript(Transcript transcript) {
//        this.transcript = transcript;
//    }
//
//    public Classroom getClassroom() {
//        return classroom;
//    }
//
//    public void setClassroom(Classroom classroom) {
//        this.classroom = classroom;
//    }
//
//    public List<Course> getCourses() {
//        return courses;
//    }
//
//    public void setCourses(List<Course> courses) {
//        this.courses = courses;
//    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + studentId +
                ", studentNumber='" + studentNumber + '\'' +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", cpga=" + cpga +
                ", dateOfEnrollment=" + dateOfEnrollment +
                ", transcript=" + transcript +
                ", classroom=" + classroom +
                ", courses=" + courses +
                '}';
    }
}
