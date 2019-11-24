package io.zipcoder.interfaces;

public enum Educator implements Teacher{
    BOB(1, "Bob"), PHIL(2, "Phil");

    private final Instructor instructor;
    private double timeWorked;


    public double getTimeWorked() {
        return timeWorked;
    }

    Educator(long id, String name) {
    this.instructor = new Instructor(id, name);
    Instructors.getInstance().add(this.instructor);
    this.timeWorked = 0;
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {

    }
    @Override
    public void lecture(Learner[] learners, double numberOfHours) {

    }
}
