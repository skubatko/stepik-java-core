package ru.skubatko.dev.java.core.stepik.chapter3.case352;

import java.util.Arrays;

public class Case352 {
    public static void main(String[] args) {
        byte[] dataMutable = new byte[]{1, 2, 3, 4, 5};
        byte[] dataImmutable = new byte[]{1, 2, 3, 4, 5};

        AsciiCharSequence mutable = new AsciiCharSequence(dataMutable);
        AsciiCharSequenceImmutable immutable = new AsciiCharSequenceImmutable(dataImmutable);

        System.out.println("mutable BEFORE mutation: " + Arrays.toString(dataMutable));
        System.out.println("immutable BEFORE mutation: " + Arrays.toString(dataImmutable));
        System.out.println("-----------");

        mutable.mutate();
        immutable.mutate();

        System.out.println("mutable AFTER mutation: " + Arrays.toString(dataMutable));
        System.out.println("immutable AFTER mutation: " + Arrays.toString(dataImmutable));
    }

}
