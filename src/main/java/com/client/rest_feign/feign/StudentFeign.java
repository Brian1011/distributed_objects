package com.client.rest_feign.feign;

import com.client.rest_feign.models.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(name = "student", url = "http://localhost:8000/api/")
public interface StudentFeign {
    @RequestMapping(method = RequestMethod.GET, value = "students")
    List<Student> getAllStudents();
}
