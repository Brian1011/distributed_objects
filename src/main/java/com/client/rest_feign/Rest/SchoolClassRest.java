package com.client.rest_feign.Rest;

import com.client.rest_feign.feign.SchoolClassFeign;
import com.client.rest_feign.models.SchoolClass;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SchoolClassRest implements CommandLineRunner {
    private final SchoolClassFeign schoolClassFeign;

    public SchoolClassRest(SchoolClassFeign schoolClassFeign) {
        this.schoolClassFeign = schoolClassFeign;
    }

    @Override
    public void run(String... args) throws Exception {
        // get all classes
        List<SchoolClass> schoolClass = schoolClassFeign.getAllClasses();
        System.out.println("Classes "+schoolClass);

        // get a specific class
        SchoolClass singleClass = schoolClassFeign.getSingleClass(Integer.toUnsignedLong(3));
        System.out.println("Single Class: "+singleClass);
    }
}
