package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test
    public void testConstructor()   {
        Person person =  new Person(13434124, "Tim");

        long expectedLong = 13434124;
        String expectedString = "Tim";

        long actualLong = person.getId();
        String actualString = person.getName();

        Assert.assertEquals(expectedLong, actualLong);
        Assert.assertEquals(expectedString, actualString);

    }

}
