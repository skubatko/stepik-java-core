package ru.skubatko.dev.java.core.stepik.chapter2.case213;

import org.junit.Assert;
import org.junit.Test;

public class Case213Test {

    @Test
    public void whenOneTwoThree_thenTrue() {
        // given
        double a = 0.1;
        double b = 0.2;
        double c = 0.3;

        // when
        boolean result = Case213.doubleExpression(a, b, c);

        // then
        Assert.assertTrue(result);
    }

}
