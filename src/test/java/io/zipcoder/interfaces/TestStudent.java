package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TestStudent {

    @Test
    public void testImplementation(){
        Student student = new Student(123, "Billy");
        assertTrue(student instanceof Learner); // instanceof checks if student is an instanceof Learner, which in this case returns true
    }

    @Test
    public void testInheritance(){
        Student student = new Student(123, "Billy");
        assertTrue(student instanceof Person);
    }

    @Test
    public void testLearn(){
        Student student = new Student(123, "Billy");
        student.learn(5.0); // learn is a method that increments totalStudyTime by numberOfHours, and getTotalStudyTime is a method that returns totalStudyTime after being incremented, this checks if it is incrementing
        double expectedNumberOfHours = 5.0;
        Assert.assertEquals(expectedNumberOfHours, student.getTotalStudyTime(), 0.0);
    }


}
