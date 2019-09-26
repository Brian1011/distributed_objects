package com.client.rest_feign.Rest;

import com.client.rest_feign.feign.StudentCatFeign;
import com.client.rest_feign.models.Attachment;
import com.client.rest_feign.models.Department;
import com.client.rest_feign.models.Reject;
import com.client.rest_feign.models.StudentCat;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

//@Component
public class RestGroupA implements CommandLineRunner {
    private StudentCatFeign studentCatFeign;

    public RestGroupA(StudentCatFeign studentCatFeign) {
        this.studentCatFeign = studentCatFeign;
    }

    @Override
    public void run(String... args) throws Exception {
        StudentCat register_student = studentCatFeign.newStudent(new StudentCat("94006","John Doe"));
        Attachment new_attachment = studentCatFeign.newAttachment(Integer.toUnsignedLong(5), Integer.toUnsignedLong(17));
        Department alloc_dept = studentCatFeign.allocateDepartment(Integer.toUnsignedLong(3), Integer.toUnsignedLong(2), Integer.toUnsignedLong(4));
        Reject rejected_dept = studentCatFeign.rejectAllocation(new Reject(Integer.toUnsignedLong(3), Integer.toUnsignedLong(4), 3L));
    }
}
