package com.example.unittesting;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses(
        {
                EmailTest.class,
                ExampleUnitTest.class
        }
)
public class SuiteExampleTest {
}
