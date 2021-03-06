package ru.skubatko.dev.java.core.stepik.chapter6.case643;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Case643 {

    public static void topTenWords() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in, StandardCharsets.UTF_8));
        br.lines()
                .map(String::toLowerCase)
                .map(s -> s.replaceAll("[^a-zа-яё0-9]+", " "))
                .flatMap(Pattern.compile("\\s")::splitAsStream)
                .collect(TreeMap::new, (TreeMap<String, Integer> m, String s) -> {
                    if (m.containsKey(s)) {
                        m.put(s, m.get(s) + 1);
                    } else {
                        m.put(s, 1);
                    }
                }, TreeMap::putAll)
                .entrySet().stream()
                .sorted((o1, o2) -> o2.getValue() - o1.getValue())
                .limit(10)
                .forEach(e -> System.out.println(e.getKey()));
    }

    public static void topTenWordsV2() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in, StandardCharsets.UTF_8));
        br.lines()
                .map(String::toLowerCase)
                .flatMap(Pattern.compile("\\W+", Pattern.UNICODE_CHARACTER_CLASS)::splitAsStream)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed().thenComparing(Map.Entry.comparingByKey()))
                .limit(10)
                .map(Map.Entry::getKey)
                .forEach(System.out::println);
    }

}
