package io.zipcoder.interfaces;

import java.util.Arrays;
import java.util.List;

public class People {
    private List<Person> personList;
    private Person person;

    People(List<Person> personList) {
        this.personList = personList;
    }

    public void add(Person person) {
        this.personList.add(person);
    }

    public Person findById(long id) {
        for (Person i : personList) {
            if (person.getId() == id) {
            }
        }   return person;
    }

    public boolean contains(Person person)  {
        return personList.contains(person);
    }

    public void remove(Person person)   {
        personList.remove(person);
    }

    public void remove(Long id) {
        for (Person i : personList) {
            if (i.getId() == id) {
                remove(person);
            }
        }
    }

    public void removeAll() {
        personList.clear();
    }

    public int count()  {
        return personList.size();
    }

    public Person[] toArray()   {
        Person[] personArray = personList.toArray(new Person[personList.size()]);
        return personArray;
    }



}
