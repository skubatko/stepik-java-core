package ru.skubatko.dev.java.core.stepik.chapter6.case622;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Case622 {

    public static final String SPACE = " ";

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
                    System.out.print((i > 1) ? SPACE : "\n");
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
        list.forEach(e -> sb.append(e).append(SPACE));
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        System.out.println(sb);
    }

    public static void printEvenNumbersWithMap() {
        Map<Integer, Integer> map = new TreeMap<>((o1, o2) -> (o2 - o1));
        Scanner sc = new Scanner(System.in);
        int idx = 0;
        while (sc.hasNextInt()) {
            int value = sc.nextInt();
            if ((idx > 0) && (idx % 2 != 0)) {
                map.put(idx, value);
            }
            idx++;
        }
        StringBuilder sb = new StringBuilder();
        map.forEach((key, value) -> sb.append(value).append(SPACE));
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        System.out.println(sb);
    }

    public static void main(String[] args) {
//        printEvenNumbersWithArray();
//        printEvenNumbersWithList();
        printEvenNumbersWithMap();
    }

}
