package ru.skubatko.dev.java.core.stepik.chapter2.case242;

import org.junit.Assert;
import org.junit.Test;

public class Case242v2Test {

    @Test
    public void whenTwoSortedMerge_thenSorted_case1() {
        // given
        int[] a1 = {0, 2, 2};
        int[] a2 = {1, 3};
        int[] expected = {0, 1, 2, 2, 3};

        // when
        int[] result = Case242v2.mergeArrays(a1, a2);

        // then
        Assert.assertArrayEquals("wrong result !!", expected, result);
    }

    @Test
    public void whenTwoSortedMerge_thenSorted_case2() {
        // given
        int[] a1 = new int[0];
        int[] a2 = new int[0];
        int[] expected = new int[0];

        // when
        int[] result = Case242v2.mergeArrays(a1, a2);

        // then
        Assert.assertArrayEquals("wrong result !!", expected, result);
    }

    @Test
    public void whenTwoSortedMerge_thenSorted_case3() {
        // given
        int[] a1 = {0};
        int[] a2 = new int[0];
        int[] expected = {0};

        // when
        int[] result = Case242v2.mergeArrays(a1, a2);

        // then
        Assert.assertArrayEquals("wrong result !!", expected, result);
    }

    @Test
    public void whenTwoSortedMerge_thenSorted_case4() {
        // given
        int[] a1 = new int[0];
        int[] a2 = {0};
        int[] expected = {0};

        // when
        int[] result = Case242v2.mergeArrays(a1, a2);

        // then
        Assert.assertArrayEquals("wrong result !!", expected, result);
    }

}
