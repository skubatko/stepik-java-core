package ru.skubatko.dev.java.core.stepik.chapter6.case641;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Case641Test {

    @Test
    public void whenMid_thenSuccess() {
        // given
        int value = 123456;

        // when
        int result = Case641.mid(value);

        // then
        Assert.assertEquals("wrong result!!", 345, result);
    }

    @Test
    public void whenPseudoRandomStreamFirst_thenSuccess() {
        // given
        int value = 13;

        // when
        int result = Case641.pseudoRandomStream(value).findFirst().getAsInt();

        // then
        Assert.assertEquals("wrong result!!", 13, result);
    }

    @Test
    public void whenPseudoRandomStreamSecond_thenSuccess() {
        // given
        int value = 13;

        // when
        int result = Case641.pseudoRandomStream(value).skip(1).findFirst().getAsInt();

        // then
        Assert.assertEquals("wrong result!!", 16, result);
    }

    @Test
    public void whenPseudoRandomStreamArrayTen_thenSuccess() {
        // given
        int value = 13;
        int[] expected = {13, 16, 25, 62, 384, 745, 502, 200, 0, 0};

        // when
        int[] result = Case641.pseudoRandomStream(value).limit(10).toArray();

        // then
        Assert.assertArrayEquals("wrong result!!", expected, result);
    }

    @Test
    public void whenPseudoRandomStreamListTen_thenSuccess() {
        // given
        int value = 13;
        List<Integer> expected = Arrays.asList(13, 16, 25, 62, 384, 745, 502, 200, 0, 0);

        // when
        List<Integer> result = Case641.pseudoRandomStream(value).limit(10).boxed().collect(Collectors.toList());

        // then
        Assert.assertEquals("wrong result!!", expected, result);
    }

}