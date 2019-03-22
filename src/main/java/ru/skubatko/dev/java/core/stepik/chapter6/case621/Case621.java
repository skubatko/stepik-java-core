package ru.skubatko.dev.java.core.stepik.chapter6.case621;

import java.util.HashSet;
import java.util.Set;

public class Case621 {

    public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {
        Set<T> symmetricDifferentSet = new HashSet<>();
        symmetricDifferentSet.addAll(set1);
        symmetricDifferentSet.addAll(set2);

        Set<T> subSet = new HashSet<>(set1);
        subSet.retainAll(set2);

        symmetricDifferentSet.removeAll(subSet);

        return symmetricDifferentSet;
    }

}
