package io.zipcoder.interfaces;

public class Instructor extends Person implements Teacher
{


    public Instructor(long identification, String personName) {
        super(identification, personName);
    }

    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);

    }

    public void lecture(Learner[] learners, double numberOfHours) {
        double splitHours = numberOfHours / learners.length;
        for(Learner i : learners) {
            i.learn(splitHours);
        }
    }


}
