package ru.skubatko.dev.java.core.stepik.chapter2.case222;

public class Case222v2 {

    /**
     * Checks if given <code>value</code> is a power of two.
     *
     * @param value any number
     * @return <code>true</code> when <code>value</code> is power of two, <code>false</code> otherwise
     */
    public static boolean isPowerOfTwo(int value) {
        if (value == 0) return false;
        int valueAbs = Math.abs(value);
        return  (valueAbs & (valueAbs-1)) == 0;
    }

}
