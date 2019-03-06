package ru.skubatko.dev.java.core.stepik.chapter2.case241;

import java.math.BigInteger;

public class Case241RecursionV2 {

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
        return value.equals(BigInteger.ONE)
                ? BigInteger.ONE
                : value.multiply(calculateFactorial(value.subtract(BigInteger.ONE)));
    }

}
