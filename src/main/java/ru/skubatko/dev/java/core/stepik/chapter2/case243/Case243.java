package ru.skubatko.dev.java.core.stepik.chapter2.case243;

public class Case243 {

    public static String printTextPerRole(String[] roles, String[] textLines) {
        StringBuilder[] roleTextLines = new StringBuilder[roles.length];
        int[] numberOfRoleTextLines = new int[roles.length];

        for (int lineIdx = 0; lineIdx < textLines.length; lineIdx++) {
            for (int roleIdx = 0; roleIdx < roles.length; roleIdx++) {
                String roleToCheck = roles[roleIdx] + ": ";
                if (textLines[lineIdx].startsWith(roleToCheck)) {

                    int startTextLineWithNoRole = textLines[lineIdx].indexOf(": ") + 2;
                    String textLineWithNoRole = textLines[lineIdx].substring(startTextLineWithNoRole);

                    int lineNumber = lineIdx + 1;
                    if (roleTextLines[roleIdx] == null)
                        roleTextLines[roleIdx] = new StringBuilder(roles[roleIdx]).append(":\n");
                    roleTextLines[roleIdx].append(lineNumber).append(") ").append(textLineWithNoRole).append("\n");

                    numberOfRoleTextLines[roleIdx]++;
                    break;
                }
            }
        }

        StringBuilder result = new StringBuilder();
        for (StringBuilder roleTextLine : roleTextLines)
            result.append(roleTextLine).append("\n");

        result.deleteCharAt(result.length() - 1);

        return result.toString();
    }

}
