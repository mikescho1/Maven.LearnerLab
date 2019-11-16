package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {

    @Test
    public void testImplementation()    {
        Instructor instructor = new Instructor(2, "Mr. Lewis");
        Assert.assertTrue(instructor instanceof Teacher);
    }

    @Test
    public void testInheritance()   {
        Instructor instructor = new Instructor(2, "Mr. Lewis");
        Assert.assertTrue(instructor instanceof Person);
    }

    @Test
    public void testTeach() {
        Instructor instructor = new Instructor(2, "Mr. Lewis");
        Student student = new Student(8, "Mo");
        instructor.teach(student, 5.0);

        double expected = 5.0;
        double actual = student.getTotalStudyTime();

        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test
    public void totalStudyTime()    {
        Instructor instructor = new Instructor(2, "Mr. Lewis");
        Student student = new Student(8, "Mo");
        Student student1 = new Student(9, "Phil");
        Learner[] learners = new Learner[]  {student, student1};

        instructor.lecture(learners, 20);

        double expected = 10.0;
        double actual = student.getTotalStudyTime();

        Assert.assertEquals(expected, actual, 0.0);


    }


}
