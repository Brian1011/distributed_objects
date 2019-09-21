package com.client.rest_feign.Rest;

import com.client.rest_feign.feign.UniversityFeign;
import com.client.rest_feign.models.Universities;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UniversityRest implements CommandLineRunner {
    private final UniversityFeign universityFeign;

    public UniversityRest(UniversityFeign universityFeign) {
        this.universityFeign = universityFeign;
    }

    @Override
    public void run(String... args) throws Exception {
        //get all universities
        List<Universities> universities = universityFeign.fetchAllUniversities();
        System.out.println(universities);
    }
}
