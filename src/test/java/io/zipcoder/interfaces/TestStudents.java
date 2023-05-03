package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

public class TestStudents {

    @Test
    public void test(){

        //Students students = new Students();

        Assert.assertTrue(Students.getInstance());
    }

}
