package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestInstructor {

    @Test
    public void testImplementation(){
        Instructor instructor = new Instructor(17, "Mikaila");
        assertTrue(instructor instanceof Teacher);
    }

    @Test
    public void testInheritance(){
        Instructor instructor = new Instructor(17, "Mikaila");
        assertTrue(instructor instanceof Person);
    }

    @Test
    public void testTeach(){
        Instructor instructor = new Instructor(17, "Mikaila");
        Student student = new Student(123, "Billy");

        double numberOfHours = 5;

        instructor.teach(student, 5);

        Assert.assertEquals(numberOfHours, student.getTotalStudyTime(), 0.0);
    }

    @Test
    public void testLecture(){
        Instructor instructor = new Instructor(17, "Mikaila");
        Student student1 = new Student(123, "Billy");
        Student student2 = new Student(456, "Bob");
        Student student3 = new Student(789, "Mason");

        Student[] learners = {student1, student2, student3};

        double numberOfHours = 5.0;
        double totalStudyTime = numberOfHours / learners.length;

        instructor.lecture(learners, numberOfHours);

        for (Student t : learners) {
            assertEquals(totalStudyTime, t.getTotalStudyTime(), 0.0);
        }


    }



}
