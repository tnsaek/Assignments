package edu.miu.cs.cs425.eregistrarwebapi.mapper;

import edu.miu.cs.cs425.eregistrarwebapi.dto.StudentDto;
import edu.miu.cs.cs425.eregistrarwebapi.model.Student;
import org.mapstruct.Mapper;
import java.util.List;

@Mapper(componentModel = "spring")
public interface StudentMapper {

    public Student studentFromStudentDto(StudentDto studentDto);
    public StudentDto studentDtoFromStudent(Student student);
    public List<Student> studentsFromStudentDtos(List<StudentDto> studentDtos);
    public List<StudentDto> studentDtosFromStudents(List<Student> students);
}
