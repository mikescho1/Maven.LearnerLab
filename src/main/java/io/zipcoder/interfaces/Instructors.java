package io.zipcoder.interfaces;

public final class Instructors extends People<Instructor>{

    private final static Instructors INSTANCE = new Instructors();

    private Instructors()   {
        Instructor bob = new Instructor(1,"Bob");
        Instructor phil = new Instructor(2,"Phil");
        super.add(bob);
        super.add(phil);
    }
    @Override
    public Instructor[] toArray() {
        Instructor[] instructorArr = this.getPersonList().toArray(new Instructor [this.getPersonList().size()]);
        return instructorArr;
    }

    public static Instructors getInstance() {
        return INSTANCE;
    }





}
