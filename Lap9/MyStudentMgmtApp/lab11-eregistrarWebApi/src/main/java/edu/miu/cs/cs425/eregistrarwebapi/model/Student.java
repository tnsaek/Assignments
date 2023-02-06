package edu.miu.cs.cs425.eregistrarwebapi.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer studentId;
    @NotBlank
    public String studentNumber;
    @NotBlank
    public String firstName;
    public String middleName;
    @NotBlank
    public String lastName;
    public double cpga;
    @NotBlank
    public LocalDate enrollmentDate;
    public Boolean isInternational;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + studentId +
                ", studentNumber='" + studentNumber + '\'' +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", cpga=" + cpga +
                ", dateOfEnrollment=" + enrollmentDate +
                ", isInternational=" + isInternational +
                '}';
    }
}
