package edu.miu.cs.cs425.eregistrar.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "transcripts")
public class Transcript {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer transcriptId;
    private String degreeTitle;
//    @OneToOne(mappedBy = "transcript")
//    private Student student;

//    public Transcript(Integer transcriptId, String degreeTitle) {
//        this.transcriptId = transcriptId;
//        this.degreeTitle = degreeTitle;
//    }
//
//    public Transcript() {
//    }
//
//    public Long getTranscriptId() {
//        return transcriptId;
//    }
//
//    public void setTranscriptId(Long transcriptId) {
//        this.transcriptId = transcriptId;
//    }
//
//    public String getDegreeTitle() {
//        return degreeTitle;
//    }
//
//    public void setDegreeTitle(String degreeTitle) {
//        this.degreeTitle = degreeTitle;
//    }

//    public Student getStudent() {
//        return student;
//    }
//
//    public void setStudent(Student student) {
//        this.student = student;
//    }

    @Override
    public String toString() {
        return "Transcript{" +
                "transcriptId=" + transcriptId +
                ", degreeTitle='" + degreeTitle + '\'' +
                '}';
    }
}
