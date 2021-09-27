package com.example.unittesting;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ParameterizedExample {
    Email email;

    @Parameterized.Parameter(0)
    String firstName;
    @Parameterized.Parameter(1)
    String lastName;
    @Parameterized.Parameter(2)
    String emailDomain;
    @Parameterized.Parameter(3)
    String expectedEmail;

    // creates the test data
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][] { { "wil" , "smith", "@gmail.com", "wil.smith@gmail.com" },
                { "abe", "chow", "@hotmail.com", "abe.chow@hotmail.com" },
                { "mic$", "hael%", "@yahoo.com", "mic.hael@yahoo.com"} };
        return Arrays.asList(data);
    }

    @Before
    public void setup() {

    }

    @Test
    public void emailIsCorrect() {
        email = new Email(firstName, lastName, emailDomain);
        String expectedEmailString = expectedEmail;
        String actualEmailString = email.getFullEmail();
        assertEquals(expectedEmailString, actualEmailString);
    }
}
