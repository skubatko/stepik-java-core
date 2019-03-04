package ru.skubatko.dev.java.core.stepik.chapter2.case242;

public class Case242v2 {

    /**
     * Merges two given sorted arrays into one
     *
     * @param a1 first sorted array
     * @param a2 second sorted array
     * @return new array containing all elements from a1 and a2, sorted
     */
    public static int[] mergeArrays(int[] a1, int[] a2) {
        int a1Size = a1.length;
        int a2Size = a2.length;
        int resultSize = a1Size + a2Size;
        int[] result = new int[resultSize];

        int a1Idx = 0;
        int a2Idx = 0;
        for (int i = 0; i < resultSize; i++) {
            int a1Value = a1Idx < a1Size ? a1[a1Idx] : Integer.MAX_VALUE;
            int a2Value = a2Idx < a2Size ? a2[a2Idx] : Integer.MAX_VALUE;
            if (a1Value < a2Value) {
                result[i] = a1Value;
                a1Idx++;
            } else {
                result[i] = a2Value;
                a2Idx++;
            }
        }
        return result;
    }

}
