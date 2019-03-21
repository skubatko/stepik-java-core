package ru.skubatko.dev.java.core.stepik.chapter6.case611;

import org.junit.Assert;
import org.junit.Test;

public class Case611Test {

    @Test
    public void whenGetFirst_thenSuccess() {
        // given
        Pair<Integer, String> pair = Pair.of(1, "hello");

        // when
        Integer result = pair.getFirst(); // 1

        // then
        Assert.assertEquals("wrong result!!", Integer.valueOf(1), result);
    }

    @Test
    public void whenGetSecond_thenSuccess() {
        // given
        Pair<Integer, String> pair = Pair.of(1, "hello");

        // when
        String result = pair.getSecond();

        // then
        Assert.assertEquals("wrong result!!", "hello", result);
    }

    @Test
    public void whenEquals_thenSuccess() {
        // given
        Pair<Integer, String> pair = Pair.of(1, "hello");
        Pair<Integer, String> pair2 = Pair.of(1, "hello");

        // when
        boolean result = pair.equals(pair2);

        // then
        Assert.assertTrue("wrong result!!", result);
    }

    @Test
    public void whenHashCode_thenSuccess() {
        // given
        Pair<Integer, String> pair = Pair.of(1, "hello");
        Pair<Integer, String> pair2 = Pair.of(1, "hello");

        // when
        Boolean result = pair.hashCode() == pair2.hashCode();

        // then
        Assert.assertTrue("wrong result!!", result);
    }

}
