package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.List;

public class People {

    private List<Person> personList = new ArrayList<>();

    Person person;

    public void add(Person person){
        personList.add(person);
    }

    public String findById(long id){
        for (Person p : personList) {
            if(p.getId() == id){
                return person.getName();
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
        personList.remove(id);
    }

    public void removeAll(){
        personList.clear();
    }

    public int count(){
        return personList.size();
    }

    public String toArray(){
        return personList.toString();
    }

}
