package ru.skubatko.dev.java.core.stepik.chapter3.case351;

import org.junit.Assert;
import org.junit.Test;

public class Case351Test {

    @Test
    public void whenZeroTen_thenTen() {
        // given
        double a = 0.0;
        double b = 10.0;

        // when
        double result = Case351.integrate(x -> 1, a, b);

        // then
        Assert.assertEquals("wrong result !!", 10.0, result, 0.0001);
    }

    @Test
    public void whenIntegrateX_thenSuccess() {
        // given
        double a = 0.0;
        double b = 10.0;

        // when
        double result = Case351.integrate(x -> x, a, b);

        // then
        Assert.assertEquals("wrong result !!", 50.0, result, 0.0001);
    }

    @Test
    public void whenIntegrateXX_thenSuccess() {
        // given
        double a = 0.0;
        double b = 9.0;

        // when
        double result = Case351.integrate(x -> x * x, a, b);

        // then
        Assert.assertEquals("wrong result !!", 243.0, result, 0.0001);
    }

}
