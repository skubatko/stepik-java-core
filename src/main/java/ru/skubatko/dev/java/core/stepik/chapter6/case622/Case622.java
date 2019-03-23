package ru.skubatko.dev.java.core.stepik.chapter6.case622;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Case622 {

    public static void printEvenNumbersWithArray() {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String s = br.readLine();
            if (s == null || s.isEmpty()) {
                return;
            }
            String[] buffer = s.split("\\s");
            for (int i = buffer.length - 1; i > 0; i--) {
                if ((i % 2) == 1) {
                    System.out.print(buffer[i]);
                    System.out.print((i > 1) ? " " : "\n");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void printEvenNumbersWithList() {
        List<Integer> list = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int idx = 0;
        while (sc.hasNextInt()) {
            if ((idx > 0) && (idx % 2 != 0)) {
                list.add(0, sc.nextInt());
            } else {
                sc.next();
            }
            idx++;
        }
        StringBuilder sb = new StringBuilder();
        list.forEach(e -> sb.append(e).append(" "));
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        System.out.println(sb);
    }

    public static void printEvenNumbersWithMap() {
    }

    public static void main(String[] args) {
//        printEvenNumbersWithArray();
        printEvenNumbersWithList();
//        printEvenNumbersWithMap();
    }

}
