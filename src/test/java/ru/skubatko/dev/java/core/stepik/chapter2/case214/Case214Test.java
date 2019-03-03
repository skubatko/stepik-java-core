package ru.skubatko.dev.java.core.stepik.chapter2.case214;

import org.junit.Assert;
import org.junit.Test;

public class Case214Test {

    @Test
    public void whenZeroOne_thenOne() {
        // given
        int value = 0;
        int bitIndex = 1;

        // when
        int result = Case214.flipBit(value, bitIndex);

        // then
        Assert.assertEquals("wrong result!!", 1, result);
    }

    @Test
    public void whenOneOne_thenZero() {
        // given
        int value = 1;
        int bitIndex = 1;

        // when
        int result = Case214.flipBit(value, bitIndex);

        // then
        Assert.assertEquals("wrong result!!", 0, result);
    }

    @Test
    public void whenZeroThree_thenFour() {
        // given
        int value = 0;
        int bitIndex = 3;

        // when
        int result = Case214.flipBit(value, bitIndex);

        // then
        Assert.assertEquals("wrong result!!", 4, result);
    }

}
