package ru.skubatko.dev.java.core.stepik.chapter6.case643;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Case643Test {

    @Test
    public void whenText1_thenSuccess() {
        // given
        String text = "Мама мыла-мыла-мыла раму!";
        System.setIn(new ByteArrayInputStream(text.getBytes()));

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(out);
        System.setOut(ps);
        String expected = "мыла\n" +
                "мама\n" +
                "раму\n";

        // when
        Case643.topTenWordsV2();
        String result = out.toString();

        // then
        Assert.assertEquals("wrong result!!", expected, result);
    }

    @Test
    public void whenText2_thenSuccess() {
        // given
        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. " +
                "Sed sodales consectetur purus at faucibus. Donec mi quam, tempor " +
                "vel ipsum non, faucibus suscipit massa. Morbi lacinia velit blandit " +
                "tincidunt efficitur. Vestibulum eget metus imperdiet sapien laoreet " +
                "faucibus. Nunc eget vehicula mauris, ac auctor lorem. " +
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. " +
                "Integer vel odio nec mi tempor dignissim.";
        System.setIn(new ByteArrayInputStream(text.getBytes()));

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(out);
        System.setOut(ps);
        String expected = "consectetur\n" +
                "faucibus\n" +
                "ipsum\n" +
                "lorem\n" +
                "adipiscing\n" +
                "amet\n" +
                "dolor\n" +
                "eget\n" +
                "elit\n" +
                "mi\n";

        // when
        Case643.topTenWordsV2();
        String result = out.toString();

        // then
        Assert.assertEquals("wrong result!!", expected, result);
    }

}
