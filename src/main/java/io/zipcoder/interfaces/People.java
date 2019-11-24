package io.zipcoder.interfaces;

import com.sun.deploy.security.SelectableSecurityManager;
import sun.font.DelegatingShape;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public abstract class  People<E extends  Person> implements Iterable<E>{
    private ArrayList<E> personList;
    private E person;

    public People() {
        this.personList = new ArrayList<E>();
    }

    public void add(E person) {
        this.personList.add(person);
    }

    public E findById(long id) {
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
    public List<E> getPersonList() {
        return personList;
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

    public abstract E[] toArray();


    public Iterator iterator() {
        return (Iterator<E>)personList.iterator();
    }


}
