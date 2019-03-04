package ru.skubatko.dev.java.core.stepik.chapter2.case243;

public class Case243v2 {

    public static String printTextPerRole(String[] roles, String[] textLines) {
        StringBuilder result = new StringBuilder();

        for (String role : roles) {
            boolean isRolePrintedOut = false;
            for (int lineIdx = 0; lineIdx < textLines.length; lineIdx++) {
                String roleToCheck = role + ": ";
                if (textLines[lineIdx].startsWith(roleToCheck)) {
                    int startTextLineWithNoRole = textLines[lineIdx].indexOf(": ") + 2;
                    String textLineWithNoRole = textLines[lineIdx].substring(startTextLineWithNoRole);

                    int lineNumber = lineIdx + 1;
                    if (!isRolePrintedOut) {
                        result.append(role).append(":\n");
                        isRolePrintedOut = true;
                    }

                    result.append(lineNumber).append(") ").append(textLineWithNoRole).append("\n");
                }
            }
            result.append('\n');
        }
        result.deleteCharAt(result.length() - 1);

        return result.toString();
    }

}
