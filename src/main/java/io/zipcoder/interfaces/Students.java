package io.zipcoder.interfaces;

public final class Students extends People{

    private static final Students INSTANCE = new Students();


    private Students(){
        Student student1 = new Student(12, "Angel");
        Student student2 = new Student(34, "Frank");
        Student student3 = new Student(56, "Jeff");
        INSTANCE.add(student1);
        INSTANCE.add(student2);
        INSTANCE.add(student3);
    }

    public Students getInstance(){
        return INSTANCE;
    }

}
