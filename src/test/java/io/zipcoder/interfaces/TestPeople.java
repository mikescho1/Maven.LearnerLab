package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestPeople {

    @Test
    public void testAdd()   {
       List<Person> personList= new ArrayList<Person>();
        People people = new People(personList);
        Person person = new Person(5, "Billy Jean");

        people.add(person);
        Assert.assertTrue(personList.contains(person));
    }

    @Test
    public void testRemove()    {
        List<Person> personList= new ArrayList<Person>();
        People people = new People(personList);
        Person person = new Person(5, "Billy Jean");
        people.add(person);

        personList.remove(person);

        int expected = 0;
        int actual = personList.size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFindById()  {
        List<Person> personList= new ArrayList<Person>();
        People people = new People(personList);
        Person person = new Person(5, "Billy Jean");
        people.add(person);

        Person expected = person;
        Person actual = people.findById(5);

        Assert.assertEquals(expected, actual);
    }



}
