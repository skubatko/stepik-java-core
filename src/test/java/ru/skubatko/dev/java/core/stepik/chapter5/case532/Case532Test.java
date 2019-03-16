package ru.skubatko.dev.java.core.stepik.chapter5.case532;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Case532Test {

    @Test
    public void whenInput1_thenSuccess() {
        // given
        String input = "1 2 3";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(out);
        System.setOut(ps);

        // when
        Case532.main(new String[0]);
        ps.flush();
        String result = out.toString();

        // then
        Assert.assertEquals("wrong result!!", "6.000000", result);
    }

    @Test
    public void whenInput2_thenSuccess() {
        // given
        String input = "a1 b2 c3";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(out);
        System.setOut(ps);

        // when
        Case532.main(new String[0]);
        ps.flush();
        String result = out.toString();

        // then
        Assert.assertEquals("wrong result!!", "0.000000", result);
    }

    @Test
    public void whenInput3_thenSuccess() {
        // given
        String input = "-1e3\n" +
                "18 .111 11bbb";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(out);
        System.setOut(ps);

        // when
        Case532.main(new String[0]);
        ps.flush();
        String result = out.toString();

        // then
        Assert.assertEquals("wrong result!!", "-981.889000", result);
    }

}
