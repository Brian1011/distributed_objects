package com.client.rest_feign.feign;

import com.client.rest_feign.models.SchoolClass;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(name = "schoolClass", url = "localhost/api/")
public interface SchoolClassFeign {
    //all classes
    @RequestMapping(method = RequestMethod.GET, value = "allClasses")
    List<SchoolClass> getAllClasses();

    // specific class
    @RequestMapping(method = RequestMethod.GET, value = "classDetails/{id}")
    SchoolClass getSingleClass(@PathVariable(name = "id") long id);
}
