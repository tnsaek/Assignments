package edu.miu.cs.cs425.eregistrar.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "classrooms")
public class Classroom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long classroomId;
    @NotBlank
    private String buildingNumber;
    @NotBlank
    private String roomNumber;

    public Classroom(Long classroomId, String buildingNumber, String roomNumber) {
        this.classroomId = classroomId;
        this.buildingNumber = buildingNumber;
        this.roomNumber = roomNumber;
    }

    public Classroom() {
    }

    public Long getClassroomId() {
        return classroomId;
    }

    public void setClassroomId(Long classroomId) {
        this.classroomId = classroomId;
    }

    public String getBuildingNumber() {
        return buildingNumber;
    }

    public void setBuildingNumber(String buildingNumber) {
        this.buildingNumber = buildingNumber;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    @Override
    public String toString() {
        return "Classroom{" +
                "classroomId=" + classroomId +
                ", buildingNumber='" + buildingNumber + '\'' +
                ", roomNumber='" + roomNumber + '\'' +
                '}';
    }
}
