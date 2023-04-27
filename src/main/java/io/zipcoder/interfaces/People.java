package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class People {

    private List<Person> personList = new ArrayList<>();

    Person person;

    public void add(Person person){
        personList.add(person); //add person to personList
    }

    public String findById(long id){ //searches person list for the id if getId matches an id, the name associated will be
        for (Person p : personList) {
            if(p.getId() == id){
                return p.getName();
            }
        }
        return "This person does not exist";
    }

    public boolean contains(Person person){
        if (personList.contains(person)){
            return true;
        }
        return false;
    }

    public void remove(Person person){
        personList.remove(person);
    }

    public void remove(long id){
        for (Person e: personList) {
            if (e.getId() == id) {
                personList.remove(e);
                break;
            }
        }
    }

    public void removeAll(){
        personList.clear();
    }

    public int count(){
        return personList.size();
    }

    public Person[] toArray(){
        return personList.toArray(new Person[0]);
    }

    public Iterator<Person> iterator(){
        return personList.iterator();
    }

}
