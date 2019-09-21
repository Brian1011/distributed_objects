package com.client.rest_feign.feign;

import com.client.rest_feign.models.Universities;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(name = "university", url = "http://localhost:8000/api/")
public interface UniversityFeign {
    //all universities
    @RequestMapping(method = RequestMethod.GET, value = "universities")
    List<Universities> fetchAllUniversities();

    // post new
    @RequestMapping(method = RequestMethod.POST, value = "universities")
    Universities createUniversity(@RequestBody Universities universities);

    // get by id
    @RequestMapping(method = RequestMethod.GET, value = "universities/{id}")
    Universities findById(@PathVariable(name="id") long id);

    // patch
    @RequestMapping(method = RequestMethod.PATCH, value = "universities/{id}")
    Universities updateUni(@PathVariable(name = "id") Long id, @RequestBody Universities universities);

    // delete
    @RequestMapping(method = RequestMethod.DELETE, value = "universities/{id}")
    Universities deleteUni(@PathVariable(name = "id") Long id);
}
