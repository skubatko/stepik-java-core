package ru.skubatko.dev.java.core.stepik.chapter5.case521;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class Case521Test {

    @Test
    public void when_then() throws IOException {
        // given
        byte[] data = {0x33, 0x45, 0x01};
        ByteArrayInputStream in = new ByteArrayInputStream(data);

        // when
        int result = Case521.checkSumOfStream(in);

        // then
        Assert.assertEquals("wrong result!!", 71, result);
    }

}
