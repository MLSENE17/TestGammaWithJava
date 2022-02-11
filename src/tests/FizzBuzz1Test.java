package tests;

import main.Stage1.FizzBuzz1;
import org.junit.Assert;
import org.junit.Test;


public class FizzBuzz1Test {
    @Test
    public void testFizzBuzz() {
        Assert.assertEquals(FizzBuzz1.response(17), "17");
        Assert.assertEquals(FizzBuzz1.response(9), FizzBuzz1.FIZZ);
        Assert.assertEquals(FizzBuzz1.response(40), FizzBuzz1.BUZZ);
        Assert.assertEquals(FizzBuzz1.response(30), FizzBuzz1.FIZZ + FizzBuzz1.BUZZ);
        Assert.assertEquals(FizzBuzz1.response(88), "88");
    }
}