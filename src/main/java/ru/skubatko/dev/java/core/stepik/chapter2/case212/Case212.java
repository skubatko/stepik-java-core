package ru.skubatko.dev.java.core.stepik.chapter2.case212;

public class Case212 {

    public static int leapYearCount(int year) {
        return year / 400 + year / 4 - year / 100;
    }

}
