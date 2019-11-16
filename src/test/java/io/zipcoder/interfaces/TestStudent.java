package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {

    @Test
    public void testImplementation()    {
        Student student = new Student(1, "Mike");

        Assert.assertTrue(student instanceof Learner);
    }


    @Test
    public void testInheritance()   {
        Student student = new Student(8, "Mo");

        Assert.assertTrue(student instanceof Person);
    }

    @Test
    public void testLearn() {
        Student student = new Student(8, "Mo");
        student.learn(2.5);
        student.learn(2.5);

        Double expected = 10.0;
        Double actual = student.getTotalStudyTime();

        Assert.assertEquals(expected, actual, 0.0);
    }


}
