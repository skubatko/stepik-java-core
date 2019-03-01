package ru.skubatko.dev.java.core.stepik.chapter2.case212;

import org.junit.Assert;
import org.junit.Test;

public class Case212Test {

    @Test
    public void whenOne_thenZero() {
        // given
        int year = 1;

        // when
        int result = Case212.leapYearCount(year);

        // then
        Assert.assertEquals("wrong result!!", 0, result);

    }

    @Test
    public void whenFour_thenOne() {
        // given
        int year = 4;

        // when
        int result = Case212.leapYearCount(year);

        // then
        Assert.assertEquals("wrong result!!", 1, result);

    }

    @Test
    public void whenHundred_thenTwentyFour() {
        // given
        int year = 100;

        // when
        int result = Case212.leapYearCount(year);

        // then
        Assert.assertEquals("wrong result!!", 24, result);

    }

}
