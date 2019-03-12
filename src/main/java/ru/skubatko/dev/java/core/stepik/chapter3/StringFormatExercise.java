package ru.skubatko.dev.java.core.stepik.chapter3;

import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.Locale;

public class StringFormatExercise {

    public static void main(String[] args) {

        Locale ruLocale = new Locale("ru", "RU");

        System.out.println(String.format("E = %.3f", Math.E));
        System.out.println(String.format("E = %10.3f", Math.E));
        System.out.println(String.format("E = %-10.3f", Math.E));
        System.out.println(String.format("TEN = %d", BigInteger.TEN));
        System.out.println(String.format("TEN = %08d", BigInteger.TEN));
        System.out.println(String.format("TEN = %+8d", BigInteger.TEN));
        System.out.println(String.format("E then TEN = %d%n%20.5f", BigInteger.TEN, Math.E));

        Calendar now = Calendar.getInstance();
        System.out.println(String.format("Date now = %tB", now));
        System.out.println(String.format("Date now = %tD", now));
        System.out.println(String.format("Date now = %td %tm %ty", now, now, now));
        System.out.println(String.format("Date now = %te.%tm.%tY", now, now, now));
        System.out.println(String.format("Date now = %te.%tm.%tY %tl:%tM %tp", now, now, now, now, now, now));

        String pattern = "###,###.##";
        DecimalFormat myFormatter = new DecimalFormat(pattern);
        System.out.printf("DF ex = %s", myFormatter.format(Math.E * 1_000_000));

    }

}
