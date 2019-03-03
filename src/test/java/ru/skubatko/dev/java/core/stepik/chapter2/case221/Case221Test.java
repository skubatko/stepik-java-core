package ru.skubatko.dev.java.core.stepik.chapter2.case221;

import org.junit.Assert;
import org.junit.Test;

public class Case221Test {

    @Test
    public void whenThirtyTwo_thenVerticalLine() {
        // given
        int a = 32;

        // when
        char result = Case221.charExpression(a);

        // then
        Assert.assertEquals("wrong result !!", result, '|');
    }

    @Test
    public void whenTwentyNine_thenY() {
        // given
        int a = 29;

        // when
        char result = Case221.charExpression(a);

        // then
        Assert.assertEquals("wrong result !!", result, 'y');
    }

}
