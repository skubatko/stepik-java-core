package ru.skubatko.dev.java.core.stepik.chapter2.case231;

public class Case231 {

    /**
     * Checks if given <code>text</code> is a palindrome.
     *
     * @param text any string
     * @return <code>true</code> when <code>text</code> is a palindrome, <code>false</code> otherwise
     */
    public static boolean isPalindrome(String text) {
        if (text.isEmpty()) return true;
        String textAscii = text.replaceAll("[^a-zA-Z0-9]+", "");
        StringBuilder sb = new StringBuilder(textAscii);
        String reversed = sb.reverse().toString();
        return textAscii.equalsIgnoreCase(reversed);
    }

}
