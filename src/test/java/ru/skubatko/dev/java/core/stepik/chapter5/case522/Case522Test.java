package ru.skubatko.dev.java.core.stepik.chapter5.case522;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Case522Test {

    @Test
    public void whenByteArray1_thenSuccess() throws IOException {
        // given
        byte[] data = {65, 66, 13, 13, 10, 10, 13, 67, 13, 13};
        byte[] expected = {65, 66, 13, 10, 10, 13, 67, 13, 13};
        ByteArrayOutputStream out = init(data);

        // when
        Case522.main(null);
        byte[] result = out.toByteArray();

        // then
        Assert.assertArrayEquals("wrong result", expected, result);
    }

    @Test
    public void whenByteArray2_thenSuccess() throws IOException {
        // given
        byte[] data = {65, 13, 10, 10, 13};
        byte[] expected = {65, 10, 10, 13};
        ByteArrayOutputStream out = init(data);

        // when
        Case522.main(null);
        byte[] result = out.toByteArray();

        // then
        Assert.assertArrayEquals("wrong result", expected, result);
    }

    @Test
    public void whenByteArray3_thenSuccess() throws IOException {
        // given
        byte[] data = {1, 2, 13, 10, 3, 4, 13, 10, 5, 6};
        byte[] expected = {1, 2, 10, 3, 4, 10, 5, 6};
        ByteArrayOutputStream out = init(data);

        // when
        Case522.main(null);
        byte[] result = out.toByteArray();

        // then
        Assert.assertArrayEquals("wrong result", expected, result);
    }

    @Test
    public void whenByteArray4_thenSuccess() throws IOException {
        // given
        byte[] data = {97, 98, 10, 99, 100};
        byte[] expected = {97, 98, 10, 99, 100};
        ByteArrayOutputStream out = init(data);

        // when
        Case522.main(null);
        byte[] result = out.toByteArray();

        // then
        Assert.assertArrayEquals("wrong result", expected, result);
    }

    @Test
    public void whenEmptyByteArray_thenSuccess() throws IOException {
        // given
        byte[] data = {};
        byte[] expected = {};
        ByteArrayOutputStream out = init(data);

        // when
        Case522.main(null);
        byte[] result = out.toByteArray();

        // then
        Assert.assertArrayEquals("wrong result", expected, result);
    }

    private ByteArrayOutputStream init(byte[] data) {
        ByteArrayInputStream inputStream = new ByteArrayInputStream(data);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(out);
        System.setIn(inputStream);
        System.setOut(ps);
        return out;
    }

}
