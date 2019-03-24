package ru.skubatko.dev.java.core.stepik.chapter6.case641;

import java.util.stream.IntStream;

public class Case641 {

    public static IntStream pseudoRandomStream(int seed) {
        return IntStream.iterate(seed, i -> mid(i * i));
    }

    public static int mid(int value) {
        return value / 10 % 1000;
    }

    public static void main(String[] args) {
        pseudoRandomStream(13).peek(System.out::println).limit(10).sum();
    }

}
