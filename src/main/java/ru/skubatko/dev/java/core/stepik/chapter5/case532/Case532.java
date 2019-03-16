package ru.skubatko.dev.java.core.stepik.chapter5.case532;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Case532 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double result = 0.0;
        while (sc.hasNext()) {
            try {
                result += sc.nextDouble();
            } catch (InputMismatchException e) {
                sc.next();
            }
        }
        System.out.printf("%.6f", result);
    }

}
