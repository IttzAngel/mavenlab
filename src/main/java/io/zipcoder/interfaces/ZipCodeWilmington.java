package io.zipcoder.interfaces;

public class ZipCodeWilmington {

    private static final ZipCodeWilmington INSTANCE = new ZipCodeWilmington();
    //private Students students;
    //private Instructors instructors;

    private final Students students = Students.getInstance();
    private final Instructors instructors = Instructors.getInstance();

    private ZipCodeWilmington(){
//        students = Students.getInstance();
//        instructors = Instructors.getInstance();
    }

    public void hostLecture(Teacher teacher, double numberOfHours){
        //teacher.lecture(Learner);
    }

    public static ZipCodeWilmington getInstance(){
        return INSTANCE;
    }


}
