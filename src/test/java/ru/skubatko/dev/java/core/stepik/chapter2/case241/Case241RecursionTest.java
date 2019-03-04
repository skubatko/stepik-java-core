package ru.skubatko.dev.java.core.stepik.chapter2.case241;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigInteger;

public class Case241RecursionTest {

    @Test
    public void whenOne_thenOne() {
        // given
        int value = 1;

        // when
        BigInteger result = Case241Recursion.factorial(value);

        // then
        Assert.assertEquals("wrong result !!", BigInteger.ONE, result);
    }

    @Test
    public void whenThree_thenSix() {
        // given
        int value = 3;

        // when
        BigInteger result = Case241Recursion.factorial(value);

        // then
        Assert.assertEquals("wrong result !!", BigInteger.valueOf(6), result);
    }

    @Test
    public void whenFive_thenHundredTwenty() {
        // given
        int value = 5;

        // when
        BigInteger result = Case241Recursion.factorial(value);

        // then
        Assert.assertEquals("wrong result !!", BigInteger.valueOf(120), result);
    }

    @Test
    public void whenEight_thenSuccess() {
        // given
        int value = 8;

        // when
        BigInteger result = Case241Recursion.factorial(value);

        // then
        Assert.assertEquals("wrong result !!", BigInteger.valueOf(40320), result);
    }

}
