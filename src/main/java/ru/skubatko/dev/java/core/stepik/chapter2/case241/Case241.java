package ru.skubatko.dev.java.core.stepik.chapter2.case241;

import java.math.BigInteger;

public class Case241 {

    /**
     * Calculates factorial of given <code>value</code>.
     *
     * @param value positive number
     * @return factorial of <code>value</code>
     */
    public static BigInteger factorial(int value) {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= value; i++)
            result = result.multiply(BigInteger.valueOf(i));
        return result;
    }

}
