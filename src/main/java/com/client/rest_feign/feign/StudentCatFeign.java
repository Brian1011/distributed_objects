package com.client.rest_feign.feign;

import com.client.rest_feign.FeignConfig;
import com.client.rest_feign.models.Attachment;
import com.client.rest_feign.models.Department;
import com.client.rest_feign.models.Reject;
import com.client.rest_feign.models.StudentCat;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "student", url ="", configuration = FeignConfig.class)
public interface StudentCatFeign {
    @RequestMapping(method = RequestMethod.POST, value = "students")
    StudentCat newStudent(@RequestBody StudentCat studentCat);

    @RequestMapping(method = RequestMethod.POST, value = "companies/{companyId}/attachments")
    Attachment newAttachment(@PathVariable(name = "companyId")Long companyId, @RequestParam(name = "studentId") Long studentId);

    @RequestMapping(method = RequestMethod.PATCH, value = "companies/{companyId}/attachments")
    Department allocateDepartment(@PathVariable(name = "companyId")Long companyId, @RequestParam(name = "studentId") Long studentId, @RequestParam(name="departmentId") Long  departmentId);

    @RequestMapping(method = RequestMethod.DELETE, value = "departments")
    Reject rejectAllocation(@RequestBody Reject reject);
}
