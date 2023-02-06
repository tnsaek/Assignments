package edu.miu.cs.cs425.eregistrar.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer studentId;
    @NotBlank
    private String studentNumber;
    @NotBlank
    private String firstName;
    private String middleName;
    @NotBlank
    private String lastName;
    private double cpga;
    private LocalDate enrollmentDate;
    private Boolean isInternational;
    @OneToOne(cascade = CascadeType.ALL)
    private Transcript transcript;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + studentId +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", cpga=" + cpga +
                ", dateOfEnrollment=" + enrollmentDate +
                ", transcript=" + transcript +
                '}';
    }
}
