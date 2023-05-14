package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TestStudents {

    @Test
    public void test(){

        Students students = Students.getInstance();

        Student student1 = new Student(12, "Angel");
        Student student2 = new Student(34, "Frank");
        Student student3 = new Student(56, "Jeff");

        students.add(student1);
        students.add(student2);
        students.add(student3);

        Assert.assertTrue(students.contains(student1));
        Assert.assertTrue(students.contains(student2));
        Assert.assertTrue(students.contains(student3));
        //Assert.assertTrue(instructors.contains(student1));
    }

}
