package ru.skubatko.dev.java.core.stepik.chapter6.case622;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;

public class Case622Test {

    @Test
    public void whenEmptyInputArray_thenSuccess() {
        // given
        InputStream in = new ByteArrayInputStream("".getBytes());
        System.setIn(in);
        OutputStream out = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(out);
        System.setOut(ps);

        // when
        Case622.printEvenNumbersWithArray();
        String result = out.toString();

        // then
        Assert.assertEquals("wrong result!!", "", result);
    }

    @Test
    public void whenPrintWithArray_thenSuccess() {
        // given
        InputStream in = new ByteArrayInputStream("1 2 3 4 5 6 7".getBytes());
        System.setIn(in);
        OutputStream out = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(out);
        System.setOut(ps);

        // when
        Case622.printEvenNumbersWithArray();
        String result = out.toString();

        // then
        Assert.assertEquals("wrong result!!", "6 4 2\n", result);
    }

    @Test
    public void whenEmptyInputList_thenSuccess() {
        // given
        InputStream in = new ByteArrayInputStream("".getBytes());
        System.setIn(in);
        OutputStream out = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(out);
        System.setOut(ps);

        // when
        Case622.printEvenNumbersWithList();
        String result = out.toString();

        // then
        Assert.assertEquals("wrong result!!", "\n", result);
    }

    @Test
    public void whenPrintWithList_thenSuccess() {
        // given
        InputStream in = new ByteArrayInputStream("1 2 3 4 5 6 7".getBytes());
        System.setIn(in);
        OutputStream out = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(out);
        System.setOut(ps);

        // when
        Case622.printEvenNumbersWithList();
        String result = out.toString();

        // then
        Assert.assertEquals("wrong result!!", "6 4 2\n", result);
    }

}
