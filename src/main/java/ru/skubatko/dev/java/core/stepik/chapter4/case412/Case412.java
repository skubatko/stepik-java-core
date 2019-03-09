package ru.skubatko.dev.java.core.stepik.chapter4.case412;

public class Case412 {

    public static String getCallerClassAndMethodName() {
        try {
            String methodName = Thread.currentThread().getStackTrace()[3].getMethodName();
            String className = Thread.currentThread().getStackTrace()[3].getClassName();
            return className + "#" + methodName;
        } catch (ArrayIndexOutOfBoundsException e) {
            return null;
        }
    }

    private static void anotherMethod() {
        System.out.println(getCallerClassAndMethodName());
    }

    public static void main(String[] args) {
        System.out.println(getCallerClassAndMethodName());
        anotherMethod();
    }

}
