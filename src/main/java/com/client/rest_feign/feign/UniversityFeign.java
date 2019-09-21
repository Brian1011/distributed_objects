package com.client.rest_feign.feign;

import com.client.rest_feign.models.Universities;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(name = "university", url = "http://localhost:8000/api/")
public interface UniversityFeign {
    //all universities
    @RequestMapping(method = RequestMethod.GET, value = "universities")
    List<Universities> fetchAllUniversities();


}
