package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructors {

    @Test
    public void test(){

        //Instructors instructors = new Instructors();

        Assert.assertTrue(Instructors.getInstance());
    }
}
