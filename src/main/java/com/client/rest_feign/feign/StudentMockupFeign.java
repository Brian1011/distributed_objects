package com.client.rest_feign.feign;

import com.client.rest_feign.FeignConfig;
import com.client.rest_feign.models.StudentMockup;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(name = "mockup", url = "http://localhost/api/", configuration = FeignConfig.class)
public interface StudentMockupFeign  {
    // all students
    @RequestMapping(method = RequestMethod.GET, value = "students")
    List<StudentMockup> getAllStudents();

    // post new student
    @RequestMapping(method = RequestMethod.POST, value = "students")
    StudentMockup createStudent(@RequestBody StudentMockup studentMockup);

    // enroll for a unit
    @RequestMapping(method = RequestMethod.POST, value = "/{unitId}/enroll/{studentId}")
    StudentMockup enrollStudent(@PathVariable(name = "unitId") long unitId, @PathVariable(name="studentId") long studentId);

    // validate a unit
    @RequestMapping(method = RequestMethod.POST, value = "/{unitId}/enroll/{enrollmentKey}")
    StudentMockup validateEnrollment(@PathVariable(name = "unitId") long unitId, @PathVariable(name = "enrollmentKey") long enrollmentKey);

}
