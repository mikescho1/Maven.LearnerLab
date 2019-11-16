package io.zipcoder.interfaces;

import com.sun.deploy.security.SelectableSecurityManager;
import sun.font.DelegatingShape;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class People<E> implements Iterable<E>{
    private ArrayList<Person> personList;
    private Person person;

    public People() {
        this.personList = new ArrayList<Person>();
    }

    public void add(Person person) {
        this.personList.add(person);
    }

    public Person findById(long id) {
        for (Person i : personList) {
            if (i.getId() == id) {
                return person;
            }
        }   return null;
    }

    public boolean contains(Person person)  {
        return personList.contains(person);
    }

    public void remove(Person person)   {
        if (this.contains(person)) {
            personList.remove(person);

        }
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


    public Iterator iterator() {
        return (Iterator<E>)personList.iterator();
    }


}
