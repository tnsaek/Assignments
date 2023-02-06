package edu.miu.cs.cs425.eregistrarwebapi;

import edu.miu.cs.cs425.eregistrarwebapi.model.Student;
import edu.miu.cs.cs425.eregistrarwebapi.service.StudentService;
import edu.miu.cs.cs425.eregistrarwebapi.service.impl.StudentServiceImpl;
import io.swagger.annotations.SwaggerDefinition;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.time.LocalDate;


@OpenAPIDefinition
@SpringBootApplication
public class Lab11EregistrarWebApiApplication {


    public static void main(String[] args) {
        SpringApplication.run(Lab11EregistrarWebApiApplication.class, args);
    }

}
