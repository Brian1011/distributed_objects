package com.client.rest_feign.feign;

import com.client.rest_feign.models.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(name = "student", url = "http://localhost:8000/api/")
public interface StudentFeign {
    // all students
    @RequestMapping(method = RequestMethod.GET, value = "students")
    List<Student> getAllStudents();

    // new student
    @RequestMapping(method = RequestMethod.POST, value = "students")
    Student createStudent(@RequestBody Student student);

    // get student by id
    @RequestMapping(method = RequestMethod.GET, value = "students/{id}")
    Student studentById(@PathVariable(name = "id") long id);

    // patch

}
