package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructors {



    @Test
    public void testInstructorsInstance()    {
        Instructors instructors = Instructors.getInstance();

        Integer expected = 2;
        Integer actual = instructors.count();

        Assert.assertEquals(expected, actual);
    }




}
