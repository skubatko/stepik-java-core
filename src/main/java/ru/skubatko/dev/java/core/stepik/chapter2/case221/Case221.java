package ru.skubatko.dev.java.core.stepik.chapter2.case221;

public class Case221 {

    public static char charExpression(int a) {
        byte b = 1;
        char c = (char) b;
        long l = 1L;
        float f = l;
        double d = l;
        long ll = (long) d;
        return (char) ('\\' + a);
    }

}
