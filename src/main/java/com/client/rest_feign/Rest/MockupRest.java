package com.client.rest_feign.Rest;

import com.client.rest_feign.cat1.PracticalCatFeign;
import com.client.rest_feign.feign.StudentMockupFeign;
import com.client.rest_feign.models.StudentMockup;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

//@Component
public class MockupRest implements CommandLineRunner {
    private final PracticalCatFeign studentMockupFeign;

    public MockupRest(PracticalCatFeign studentMockupFeign) {
        this.studentMockupFeign = studentMockupFeign;
    }

    @Override
    public void run(String... args) throws Exception {
        //List<StudentMockup> students = studentMockupFeign.getAllStudents();
        //StudentMockup new_student = studentMockupFeign.createStudent(new StudentMockup("John Doe","94006"));

        //StudentMockup enroll_student = studentMockupFeign.enrollStudent(1L, 5L);
        //StudentMockup validate_student = studentMockupFeign.validateEnrollment(1L, 1569431748L);
    }
}
