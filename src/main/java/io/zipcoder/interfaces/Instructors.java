package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.List;

public final class Instructors extends People{

    private static final Instructors INSTANCE = new Instructors();
    private List<Instructor> zipCode;


    private Instructors(){

        zipCode = new ArrayList<>();

        Instructor instructor1 = new Instructor(7936, "Mikaila");
        Instructor instructor2 = new Instructor(3871, "Peter");
        Instructor instructor3 = new Instructor(4209, "Bobby");

        zipCode.add(instructor1);
        zipCode.add(instructor2);
        zipCode.add(instructor3);
//        INSTANCE.add(instructor1);
//        INSTANCE.add(instructor2);
//        INSTANCE.add(instructor3);
//        INSTANCE.add(zipCode);
    }

    public static Instructors getInstance(){
        return INSTANCE;
    }




}
