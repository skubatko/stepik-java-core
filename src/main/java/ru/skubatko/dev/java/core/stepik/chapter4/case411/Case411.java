package ru.skubatko.dev.java.core.stepik.chapter4.case411;

public class Case411 {

    public static double sqrt(double x) {
        if (x < 0) throw new IllegalArgumentException("Expected non-negative number, got " + x);
        return Math.sqrt(x);
    }

    public static void main(String[] args) {
        sqrt(-1.0);
    }

}
