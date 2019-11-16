package io.zipcoder.interfaces;

public final class Instructors extends People{

    private final static Instructors INSTANCE = new Instructors();

    private Instructors()   {
        Instructor bob = new Instructor(1,"Bob");
        Instructor phil = new Instructor(1,"Phil");
        super.add(bob);
        super.add(phil);
    }

    public static Instructors getInstance() {
        return INSTANCE;
    }





}
