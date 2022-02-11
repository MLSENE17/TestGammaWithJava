package tests;

import main.Stage2.FizzBuzz2;
import org.junit.Assert;
import org.junit.Test;


public class FizzBuzz2Test {

    @Test
    public void testFizzBuzz() {
        Assert.assertEquals(FizzBuzz2.response(8), "8");
        Assert.assertEquals(FizzBuzz2.response(13), FizzBuzz2.FIZZ);
        Assert.assertEquals(FizzBuzz2.response(9), FizzBuzz2.FIZZ);
        Assert.assertEquals(FizzBuzz2.response(53), FizzBuzz2.BUZZ);
        Assert.assertEquals(FizzBuzz2.response(45), FizzBuzz2.FIZZ + FizzBuzz2.BUZZ);
        Assert.assertEquals(FizzBuzz2.response(88), "88");
    }
}