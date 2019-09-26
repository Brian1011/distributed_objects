package com.client.rest_feign.cat1;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class PracticalCatRest implements CommandLineRunner {
    private final PracticalCatFeign practicalCatFeign;

    public PracticalCatRest(PracticalCatFeign practicalCatFeign) {
        this.practicalCatFeign = practicalCatFeign;
    }

    @Override
    public void run(String... args) throws Exception {
        //Student new_student = practicalCatFeign.newStudent(new Student("94006", "Brian Mutinda"));
        //{"id":35,"studentNumber":"94006","firstName":"Brian Mutinda","score":3,"attachment":null}
        Match new_match = practicalCatFeign.new_match("MALE", Integer.toUnsignedLong(35));
        //{"id":38,"student":{"id":35,"studentNumber":"94006","firstName":"Brian Mutinda","score":8,"attachment":null},"match":{"id":20,"name":"Brayo","gender":"MALE","description":"Tall light and handsome"},"requested":null,"reason":null}
        Match reject_match = practicalCatFeign.reject_match(Integer.toUnsignedLong(38), new RejectDate(Integer.toUnsignedLong(35),"He is male and I looking for a female"));
        //{"id":38,"student":{"id":35,"studentNumber":"94006","firstName":"Brian Mutinda","score":15,"attachment":null},"match":{"id":20,"name":"Brayo","gender":"MALE","description":"Tall light and handsome"},"requested":null,"reason":"He is male and I looking for a female"}
        Match new_date = practicalCatFeign.requestDate(Integer.toUnsignedLong(38),Integer.toUnsignedLong(16),Integer.toUnsignedLong(35));
    }
}
