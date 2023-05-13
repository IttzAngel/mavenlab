package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TestStudents {

    @Test
    public void test(){

        //Students students = new Students();
//        Student student = new Student(12, "Angel");
//        People people = new People();

        List<Student> currentCohort = new ArrayList<>();

        Students students = Students.getInstance();

        for (Student student : currentCohort) {
            Assert.assertTrue(students.contains(student));
        }


        //Assert.assertTrue(Students.getInstance().contains(new Student(12, "Angel")));
        //Assert.assertEquals(Students.getInstance(), people.contains(student);
        //Assert.assertEquals(Students.getInstance(), students);
    }

}
