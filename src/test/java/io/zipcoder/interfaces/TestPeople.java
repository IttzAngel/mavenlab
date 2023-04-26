package io.zipcoder.interfaces;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

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
        assertEquals(personList, personList);
    }

    @Test
    public void remove(){
        People people = new People();
        Person person = new Person(123, "Angel");

        people.remove(123);

        assertEquals(person, person.getName());

    }


    @Test
    public void testFindById(){
        Person person = new Person(400, "Jones");

        long id = 400;

        person.getId();

        assertEquals(id, person.getId());

    }


}
