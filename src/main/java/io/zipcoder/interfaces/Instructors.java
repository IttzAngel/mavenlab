package io.zipcoder.interfaces;

public final class Instructors extends People{

    private static final Instructors INSTANCE = new Instructors();


    private Instructors(){
        Instructor instructor1 = new Instructor(7936, "Mikaila");
        Instructor instructor2 = new Instructor(3871, "Peter");
        Instructor instructor3 = new Instructor(4209, "Bobby");
        INSTANCE.add(instructor1);
        INSTANCE.add(instructor2);
        INSTANCE.add(instructor3);
    }

    public static Instructors getInstance(){
        return INSTANCE;
    }




}
