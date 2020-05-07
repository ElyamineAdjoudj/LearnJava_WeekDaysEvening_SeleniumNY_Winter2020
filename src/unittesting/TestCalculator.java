package unittesting;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestCalculator {

    @Before
    public  void welcome(){
        System.out.println("Welcome to Testing World");
    }

    @Test
    public void testDoSummationUsingTwoParameter() {

        // Calculator.doSummation(30,50);
        // Expected Result: 80
        // Actual Result:
        // Assertion: Validate your test case
        int actualResult = Calculator.doSummation(30, 50);
        int expectedResult = 80;
        Assert.assertEquals("Test Case not pass", expectedResult, actualResult);
    }

    // TestCase
    @Test()
    public void testDoSummationUsingThreeParameter() {
        int actualResult = Calculator.doSummation(30, 50,70);
        int expectedResult = 150;
        Assert.assertEquals("Test Case not pass", expectedResult, actualResult);
    }

    @After
    public  void goodBye(){
        System.out.println("Good Bye from Testing World");
    }

}
