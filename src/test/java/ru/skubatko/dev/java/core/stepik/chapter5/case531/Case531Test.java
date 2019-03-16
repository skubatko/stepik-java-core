package ru.skubatko.dev.java.core.stepik.chapter5.case531;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class Case531Test {

    @Test
    public void whenAscii_thenSuccess() throws IOException {
        // given
        InputStream is = new ByteArrayInputStream(new byte[]{48, 49, 50, 51});

        // when
        String result = Case531.readAsString(is, StandardCharsets.US_ASCII);

        // then
        Assert.assertEquals("wrong result!!", "0123", result);
    }

    @Test
    public void whenAsciiWithCr_thenSuccess() throws IOException {
        // given
        InputStream is = new ByteArrayInputStream(new byte[]{48, 49, 13, 10, 50, 51});

        // when
        String result = Case531.readAsString(is, StandardCharsets.US_ASCII);

        // then
        Assert.assertEquals("wrong result!!", "01\r\n23", result);
    }

    @Test
    public void whenEmptyInputSource_thenSuccess() throws IOException {
        // given
        InputStream is = new ByteArrayInputStream(new byte[0]);

        // when
        String result = Case531.readAsString(is, StandardCharsets.US_ASCII);

        // then
        Assert.assertEquals("wrong result!!", "", result);
    }

}
