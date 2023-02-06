package edu.miu.cs.cs425.eregistrarwebapi.dto;

import lombok.*;

import java.time.LocalDate;

@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
@Getter
@Setter
@Builder
public class StudentDto {
    private String studentId;
    private String studentNumber;
    private String firstName;
    private String middleName;
    private String lastName;
    private double cpga;
    private LocalDate enrollmentDate;
    private Boolean isInternational;
}
