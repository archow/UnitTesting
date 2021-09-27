package com.example.unittesting;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class EmailTest {
    private Email email;
    private String expectedEmailString;

    //Sets up your objects to be run in tests
    @Before
    public void setup() {
        email = new Email("wil", "smith", "@gmail.com");
    }

    @After
    public void cleanup() {
        //if you have any network call or service, you'll close out those calls here
    }

    //Runs the actual test
    @Test
    public void emailIsCorrect() {
        expectedEmailString = "wil.smith@gmail.com";
        String actualEmailString = email.getFullEmail();
        assertEquals(expectedEmailString, actualEmailString);
    }

    @Test
    public void testNormalGetters() {
        String expectedFirstName = "wil";
        String expectedLastName = "smith";
        String expectedDomain = "@gmail.com";

        String actualFirstName = email.getFirstName();
        String actualLastName = email.getLastName();
        String actualDomain = email.getEmailDomain();

        assertEquals(expectedFirstName, actualFirstName);
        assertEquals(expectedLastName, actualLastName);
        assertEquals(expectedDomain, actualDomain);
    }
}
