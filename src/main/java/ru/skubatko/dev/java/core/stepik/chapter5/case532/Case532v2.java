package ru.skubatko.dev.java.core.stepik.chapter5.case532;

import java.util.Scanner;

public class Case532v2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double result = 0.0;
        while (sc.hasNext()) {
            if (sc.hasNextDouble()) {
                result += sc.nextDouble();
            } else {
                sc.next();
            }
        }
        System.out.printf("%.6f", result);
    }

}
