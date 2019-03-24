package ru.skubatko.dev.java.core.stepik.chapter6.case642;

import java.util.Comparator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Case642 {

    public static <T> void findMinMax(
            Stream<? extends T> stream,
            Comparator<? super T> order,
            BiConsumer<? super T, ? super T> minMaxConsumer) {

        List<T> list = stream.sorted(order).collect(Collectors.toList());
        T min = list.isEmpty() ? null : list.get(0);
        T max = list.isEmpty() ? null : list.get(list.size() - 1);

        minMaxConsumer.accept(min, max);
    }

}
