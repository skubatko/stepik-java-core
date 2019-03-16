package ru.skubatko.dev.java.core.stepik.chapter3.case352;

import java.util.Arrays;

public class Case352V2 {
    public static void main(String[] args) {
        byte[] data = new byte[]{1, 2, 3, 4, 5};

        AsciiCharSequence mutable = new AsciiCharSequence(data);
        AsciiCharSequenceImmutable immutable = new AsciiCharSequenceImmutable(data);

        System.out.println("initial data: " + Arrays.toString(data));
        System.out.println(mutable.toString());
        System.out.println(immutable.toString());

        System.out.println("-----------");

        data[4] = 1;

        System.out.println("changed data: " + Arrays.toString(data));
        System.out.println(mutable.toString());
        System.out.println(immutable.toString());
    }

}
