package ru.skubatko.dev.java.core.stepik.chapter2.case241;

import java.math.BigInteger;

public class Case241Recursion {

    /**
     * Calculates factorial of given <code>value</code>.
     *
     * @param value positive number
     * @return factorial of <code>value</code>
     */
    public static BigInteger factorial(int value) {
        return calculateFactorial(BigInteger.valueOf(value));
    }

    private static BigInteger calculateFactorial(BigInteger value) {
        if (value.equals(BigInteger.ONE)) return BigInteger.ONE;
        return value.multiply(calculateFactorial(value.subtract(BigInteger.ONE)));
    }

}
