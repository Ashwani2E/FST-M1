package examples;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class CalculatorTest {
    @Test
    @DisplayName("Testing the add method")
    public void addTest(){
        int expectedValue = 15;
        //Function call
        Calculator calc = new Calculator();
        int result1 = calc.add(5, 10);
        int result2 = calc.add(4, 11);
        //Assertions
        //Actual,Expected
        Assertions.assertEquals(expectedValue, result1, "The inputs must add upto 15");
        Assertions.assertEquals(expectedValue, result2, "The inputs must add upto 15");
        Assertions.assertTrue(result1 == 15);
        //Assertions.assertFalse(result1 != 20);

    }

//    @RepeatedTest(5)
//    public void multiplyTest() {
//        int expectedValue = 50;
//
//        Calculator calc = new Calculator();
//        Random rand = new Random();
//        int result1 = calc.multiply(rand.nextInt(10), rand.nextInt(10));
//        int result2 = calc.multiply(rand.nextInt(10), rand.nextInt(10));
//
//        Assertions.assertEquals(expectedValue, result1);
//        Assertions.assertEquals(expectedValue, result2);
//        //Assertions.assertTrue(result1 == 15);
//        //Assertions.assertFalse(result1 != 20);
//    }

}
