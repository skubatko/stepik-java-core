package ru.skubatko.dev.java.core.stepik.chapter2.case231;

public class Case231v2 {

    /**
     * Checks if given <code>text</code> is a palindrome.
     *
     * @param text any string
     * @return <code>true</code> when <code>text</code> is a palindrome, <code>false</code> otherwise
     */
    public static boolean isPalindrome(String text) {
        if (text.isEmpty()) return true;
        String textToCheck = text.toLowerCase().replaceAll("[^a-z0-9]+", "");
        StringBuilder sb = new StringBuilder(textToCheck);
        String reversed = sb.reverse().toString();
        return textToCheck.equals(reversed);
    }

}
