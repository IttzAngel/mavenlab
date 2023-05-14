package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestInstructors {

    @Test
    public void test(){

        Instructors instructors = Instructors.getInstance();

        Instructor instructor1 = new Instructor(7936, "Mikaila");
        Instructor instructor2 = new Instructor(3871, "Peter");
        Instructor instructor3 = new Instructor(4209, "Bobby");

        instructors.add(instructor1);
        instructors.add(instructor2);
        instructors.add(instructor3);

        Assert.assertTrue(instructors.contains(instructor1));
        Assert.assertTrue(instructors.contains(instructor2));
        Assert.assertTrue(instructors.contains(instructor3));
        //Assert.assertTrue(instructors.contains(instructor2));

    }
}
