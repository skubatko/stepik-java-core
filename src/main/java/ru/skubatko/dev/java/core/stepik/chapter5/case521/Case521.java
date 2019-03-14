package ru.skubatko.dev.java.core.stepik.chapter5.case521;


import java.io.IOException;
import java.io.InputStream;

public class Case521 {

    public static int checkSumOfStream(InputStream inputStream) throws IOException {
        int checksum = 0;
        int data;

        while ((data = inputStream.read()) != -1) {
            checksum = Integer.rotateLeft(checksum, 1) ^ data;
        }

        return checksum;
    }

}
