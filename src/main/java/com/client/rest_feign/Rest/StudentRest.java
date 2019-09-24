package com.client.rest_feign.Rest;

import com.client.rest_feign.feign.StudentFeign;
import com.client.rest_feign.models.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StudentRest implements CommandLineRunner {
    private final StudentFeign studentFeign;

    public StudentRest(StudentFeign studentFeign) {
        this.studentFeign = studentFeign;
    }

    @Override
    public void run(String... args) throws Exception {
        // all students
        List<Student> students = studentFeign.getAllStudents();
        System.out.println("All students "+ students);

        // post a new student

    }
}