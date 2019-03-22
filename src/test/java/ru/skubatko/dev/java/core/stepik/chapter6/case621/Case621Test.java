package ru.skubatko.dev.java.core.stepik.chapter6.case621;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Case621Test {

    @Test
    public void whenSet1AndSet2_thenSuccess() {
        // given
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(0, 1, 2));
        Set<Integer> expected = new HashSet<>(Arrays.asList(0, 3));

        // when
        Set<Integer> result = Case621.symmetricDifference(set1, set2);

        // then
        Assert.assertEquals("wrong result!!", expected, result);
    }

}