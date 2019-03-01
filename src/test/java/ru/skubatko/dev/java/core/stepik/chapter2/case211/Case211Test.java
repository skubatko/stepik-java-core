package ru.skubatko.dev.java.core.stepik.chapter2.case211;

import org.junit.Assert;
import org.junit.Test;

public class Case211Test {

    @Test
    public void whenFalseFalseFalseFalse_thenFalse(){
        // given
        boolean a = false;
        boolean b = false;
        boolean c = false;
        boolean d = false;

        // when
        boolean result = Case211.booleanExpression(a,b,c,d);

        // then
        Assert.assertFalse(result);
    }

    @Test
    public void whenTrueTrueTrueTrue_thenFalse(){
        // given
        boolean a = true;
        boolean b = true;
        boolean c = true;
        boolean d = true;

        // when
        boolean result = Case211.booleanExpression(a,b,c,d);

        // then
        Assert.assertFalse(result);
    }

    @Test
    public void whenFalseFalseTrueTrue_thenTrue(){
        // given
        boolean a = false;
        boolean b = false;
        boolean c = true;
        boolean d = true;

        // when
        boolean result = Case211.booleanExpression(a,b,c,d);

        // then
        Assert.assertTrue(result);
    }

}
