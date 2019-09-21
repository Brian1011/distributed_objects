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

        // new university
        Universities new_uni = universityFeign.createUniversity(new Universities("Kenyatta Uni", "Ruiru"));
        System.out.println(new_uni);

        // get by id
        Universities foundUni = universityFeign.findById(Integer.toUnsignedLong(5));
        System.out.println(foundUni);

        // patch
        foundUni.setLocation("KAHAWA SUKARI");
        Universities patchUni = universityFeign.updateUni(Integer.toUnsignedLong(3), foundUni);
        System.out.println(patchUni);

        // delete
        Universities deleteUni = universityFeign.deleteUni(Integer.toUnsignedLong(5));
        System.out.println(deleteUni);

        Universities deleteUNi2 = universityFeign.deleteUni(Integer.toUnsignedLong(6));
        System.out.println(deleteUNi2);
    }
}
