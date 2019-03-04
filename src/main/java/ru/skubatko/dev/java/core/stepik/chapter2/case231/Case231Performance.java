package ru.skubatko.dev.java.core.stepik.chapter2.case231;

public class Case231Performance {

    public static final int REPEAT_NUMBER = 1_000_000;

    public static void main(String[] args) {
        String text = "Madam, I'm Adam!";

        long start = System.currentTimeMillis();
        for (int i = 0; i < REPEAT_NUMBER; i++) {

            Case231.isPalindrome(text);
        }
        long elapsed = System.currentTimeMillis() - start;
        System.out.println("v1 time: " + elapsed);

        start = System.currentTimeMillis();
        for (int i = 0; i < REPEAT_NUMBER; i++) {
            Case231v2.isPalindrome(text);
        }
        elapsed = System.currentTimeMillis() - start;
        System.out.println("v2 time: " + elapsed);
    }

}
