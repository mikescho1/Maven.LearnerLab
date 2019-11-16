package io.zipcoder.interfaces;

public class Student extends Person implements Learner{
    private Double totalStudyTime;



    public Student(long identification, String personName) {
        super(identification, personName);
    }

    public void learn(Double numberOfHours) {
        totalStudyTime = totalStudyTime + numberOfHours;
    }

    public Double getTotalStudyTime() {
        return this.totalStudyTime;
    }

}
