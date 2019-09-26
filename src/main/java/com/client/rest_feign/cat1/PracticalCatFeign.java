package com.client.rest_feign.cat1;

import com.client.rest_feign.FeignConfig;
import com.client.rest_feign.models.StudentCat;
import com.client.rest_feign.models.StudentMockup;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "cat1",url = "http://10.51.10.111:2200", configuration = FeignConfig.class)
public interface PracticalCatFeign {
    @RequestMapping(method = RequestMethod.POST, value = "students")
    Student newStudent(@RequestBody Student student);

    // blind date match
    @RequestMapping(method = RequestMethod.POST, value = "matches")
    Match new_match(@RequestParam(name = "gender") String gender, @RequestParam(name = "studentId") Long studentId);

    // reject blind date
    //@RequestMapping(method = RequestMethod.PATCH, value = "matches/{Blind Date ID}")
    //Match reject_match(@PathVariable(name = "Blind Date ID") Long BlindDateID);

    //
    @RequestMapping(method = RequestMethod.PATCH, value = "matches/{BlindDateID}")
    Match reject_match(@PathVariable(name = "BlindDateID") Long BlindDateID, @RequestBody RejectDate rejectDate);

    // put
     @RequestMapping(method = RequestMethod.PUT, value = "dates/{BlindDateId}")
    Match requestDate(@PathVariable(name="BlindDateId")Long BlindDateID, @RequestParam(name = "matchId") Long matchId, @RequestParam(name = "studentId") Long studentId);
}
