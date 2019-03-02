package ru.skubatko.dev.java.core.stepik.chapter2.case231;

import org.junit.Assert;
import org.junit.Test;

public class Case231Test {

    @Test
    public void whenStirngIsPalindrom_thenTrue() {
        // given
        String text = "Madam, I'm Adam!";

        // when
        boolean result = Case231.isPalindrome(text);

        // then
        Assert.assertTrue("wrong result !!", result);
    }

}
