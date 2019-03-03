package ru.skubatko.dev.java.core.stepik.chapter2.case241;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigInteger;

public class Case241Test {

    @Test
    public void whenOne_thenOne() {
        // given
        int value = 1;

        // when
        BigInteger result = Case241.factorial(value);

        // then
        Assert.assertEquals("wrong result !!", BigInteger.ONE, result);
    }

    @Test
    public void whenThree_thenSix() {
        // given
        int value = 3;

        // when
        BigInteger result = Case241.factorial(value);

        // then
        Assert.assertEquals("wrong result !!", BigInteger.valueOf(6), result);
    }

}
