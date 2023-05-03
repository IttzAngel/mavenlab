package io.zipcoder.interfaces;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class TestPeople {

    @Test
    public void testAdd(){
        People people = new People();
        Person person1 = new Person(12, "Jimmy");
        Person person2 = new Person(34, "John");
        Person person3 = new Person(56, "Ross");

        people.add(person1);
        people.add(person2);
        people.add(person3);


        List<Person> personList = new ArrayList<>();
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);

        assertEquals(personList.contains(person1), people.contains(person1));
    }

    @Test
    public void testRemove(){
        People people = new People();
        Person person = new Person(123, "Angel");

        people.add(person);
        people.remove(person);

        assertFalse(people.contains(person));
    }

    @Test
    public void testFindById(){
        People people = new People();
        Person person = new Person(400, "Angel");

        people.add(person);

        long id = 400;
        String expectedName = "Angel";

        String actualName = people.findById(id);

        assertEquals(expectedName, actualName);
    }


}
