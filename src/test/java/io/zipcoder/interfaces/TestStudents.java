package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class TestStudents {


    @Test
    public void testSingleton() {
        Students students = Students.getInstance();
        Integer expected = 3;
        Integer actual = students.count();

        Assert.assertEquals(expected, actual);
    }
}