package io.zipcoder.interfaces;

public class Person {
    private final long id;
    private String name;


    public Person(long identification, String personName) {
        this.id = identification;
        this.name = personName;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String personName)  {
        personName = name;
    }






}
