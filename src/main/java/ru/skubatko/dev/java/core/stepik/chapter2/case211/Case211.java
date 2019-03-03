package ru.skubatko.dev.java.core.stepik.chapter2.case211;

public class Case211 {

    public static boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {
        return (a && b && !c && !d) ||
                (b && c && !d && !a) ||
                (c && d && !a && !b) ||
                (d && a && !b && !c) ||
                (a && c && !b && !d) ||
                (b && d && !a && !c);
    }

}
