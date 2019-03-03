package ru.skubatko.dev.java.core.stepik.chapter2.case243;

public class Case243 {

    private String printTextPerRole(String[] roles, String[] textLines) {
        int[] numberOfLinesInRole = new int[roles.length];
        String[] roleTextLines = new String[roles.length];

        for (int lineIdx = 0; lineIdx < textLines.length; lineIdx++) {
            for (int roleIdx = 0; roleIdx < roles.length; roleIdx++) {
                String roleToCheck = roles[roleIdx] + ": ";
                if (textLines[lineIdx].startsWith(roleToCheck)) {
                    numberOfLinesInRole[roleIdx]++;

                    int startTextLineWithNoRole = textLines[lineIdx].indexOf(": ") + 2;
                    String textLineWithNoRole = textLines[lineIdx].substring(startTextLineWithNoRole);

                    roleTextLines[roleIdx] = roleTextLines[roleIdx]
                            + numberOfLinesInRole[roleIdx]
                            + ") "
                            + textLineWithNoRole
                            + "\n";
                    break;
                }
            }
        }

        StringBuilder result = new StringBuilder();
        for (String roleTextLine : roleTextLines)
            result.append(roleTextLine).append("\n");

        return result.toString();
    }

}
