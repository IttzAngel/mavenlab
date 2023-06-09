package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.List;

public final class Students extends People{

    private static final Students INSTANCE = new Students();
    private List<Student> currentCohort;


    private Students(){

        currentCohort = new ArrayList<>();

        Student student1 = new Student(12, "Angel");
        Student student2 = new Student(34, "Frank");
        Student student3 = new Student(56, "Jeff");

        currentCohort.add(student1);
        currentCohort.add(student2);
        currentCohort.add(student3);
//        INSTANCE.add(student1);
//        INSTANCE.add(student2);
//        INSTANCE.add(student3);
    }

    public static Students getInstance(){
        return INSTANCE;
    }

}
