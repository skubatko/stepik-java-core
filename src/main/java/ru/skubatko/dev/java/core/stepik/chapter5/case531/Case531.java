package ru.skubatko.dev.java.core.stepik.chapter5.case531;


import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

public class Case531 {

    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        StringBuilder result = new StringBuilder("");
        InputStreamReader isr = new InputStreamReader(inputStream, charset);
        int data;
        while ((data = isr.read()) > 0) {
            result.append((char) data);
        }
        isr.close();
        return result.toString();
    }

}
