package ru.skubatko.dev.java.core.stepik.chapter5.case522;


import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class Case522 {
    public static final int R = 13;
    public static final int N = 10;

    public static void main(String[] args) throws IOException {;
        int data = 0;
        int prevData = -1;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        while ((data = System.in.read()) != -1) {
            if (prevData != -1 && !(prevData == R && data == N)) {
                out.write(prevData);
            }
            prevData = data;
        }
        if (prevData != -1) {
            out.write(prevData);
        }

        System.out.write(out.toByteArray());
        System.out.flush();
    }

}
