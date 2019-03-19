package ru.skubatko.dev.java.core.stepik.chapter4;

import java.io.IOException;
import java.util.Arrays;

public class FinallyErrorExercise {

    public static void tryWithResourcesError() {
        try (TestClosable closable = new TestClosable()) {
            System.out.println("try");
            throw new IOException();
//            cycle();
        } catch (Exception | Error e) {
            System.out.println("catch");
            System.out.println(Arrays.toString(e.getSuppressed()));
        } finally {
            System.out.println("finally");
        }
    }

    public static void tryFinallyError() {
        TestClosable closable = null;
        try {
            closable = new TestClosable();
            System.out.println("try");
            cycle();
        } catch ( Error e) {
            System.out.println("catch");
        } finally {
            System.out.println("finally");
            try {
                closable.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void tryFinallySystemExit() {
        try {
            System.out.println("try");
            System.exit(1);
        } catch (Exception | Error e) {
            System.out.println("catch");
        } finally {
            System.out.println("finally");
        }
    }

    public static void cycle() {
        cycle();
    }

    public static void main(String[] args) {
        System.out.println("===== tryWithResourcesError ======");
        tryWithResourcesError();

        System.out.println("===== tryFinallyError ======");
        tryFinallyError();

        System.out.println("===== tryFinallySystemExit ======");
        tryFinallySystemExit();
    }

}
