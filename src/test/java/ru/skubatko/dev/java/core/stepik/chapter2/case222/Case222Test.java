package ru.skubatko.dev.java.core.stepik.chapter2.case222;

import org.junit.Assert;
import org.junit.Test;

public class Case222Test {

    @Test
    public void whenZeroThenFalse() {
        // given
        int value = 0;

        // when
        boolean result = Case222.isPowerOfTwo(value);

        // then
        Assert.assertFalse("wrong result !!", result);
    }

    @Test
    public void whenOneThenTrue() {
        // given
        int value = 1;

        // when
        boolean result = Case222.isPowerOfTwo(value);

        // then
        Assert.assertTrue("wrong result !!", result);
    }

    @Test
    public void whenNegativeTwoThenTrue() {
        // given
        int value = -2;

        // when
        boolean result = Case222.isPowerOfTwo(value);

        // then
        Assert.assertTrue("wrong result !!", result);
    }

}
