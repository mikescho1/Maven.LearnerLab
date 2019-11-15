package io.zipcoder.interfaces;

public class Student extends Person implements Learner{
    private Double totalStudyTime;



    public Student(long identification, String personName, double totalStudyTime) {
        super(identification, personName);
        this.totalStudyTime = totalStudyTime;

    }

    public Double learn(Double numberOfHours) {
        totalStudyTime = totalStudyTime + numberOfHours;
        return totalStudyTime;
    }

    public Double getTotalStudyTime() {
        return this.totalStudyTime;
    }

}
