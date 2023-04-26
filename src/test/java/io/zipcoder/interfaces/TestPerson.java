package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test
    public void testConstructor(){

        Person person = new Person(203927, "Angel");

        long expectedID = person.getId();
        String expectedName = person.getName();

        Assert.assertEquals(expectedID, person.getId());
        Assert.assertEquals(expectedName, person.getName());
    }

    @Test
    public void testSetName(){

        Person person = new Person(1234, "Jerry");

        String name = person.getName();

        person.setName("Jerry");
        String expectedName = person.getName();

        Assert.assertEquals(expectedName, name);
    }




}
