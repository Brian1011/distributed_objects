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
        //Student new_student = studentFeign.createStudent(new Student("Brian","ICS"));
        //System.out.println(new_student);

        // get by student id
        Student get_student = studentFeign.studentById(Integer.toUnsignedLong(2));
        System.out.println(get_student);

        // patch by student id
        get_student.setName("Mr. Mutinda");
        get_student.setCourse("Masters in Data Science and Analysis");
        Student update_student = studentFeign.updateStudent(get_student.getId(), get_student);
        System.out.println(update_student);
    }
}
