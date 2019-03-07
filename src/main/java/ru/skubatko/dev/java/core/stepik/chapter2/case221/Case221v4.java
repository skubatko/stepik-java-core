package ru.skubatko.dev.java.core.stepik.chapter2.case221;

public class Case221v4 {

    public static void main(String[] args) {

        // BYTE Overflow & Underflow
        byte byteTest = Byte.MAX_VALUE;
        byteTest++;
        System.out.println("Byte Overflow:  + Byte.MAX_VALUE +  + 1 = " + byteTest);
        byteTest = Byte.MIN_VALUE;
        byteTest--;
        System.out.println("Byte Underflow:  + Byte.MIN_VALUE +  - 1 = " + byteTest);
        System.out.println();

        // SHORT Overflow & Underflow
        short shortTest = Short.MAX_VALUE;
        shortTest++;
        System.out.println("Short Overflow:  + Short.MAX_VALUE +  + 1 = " + shortTest);
        shortTest = Short.MIN_VALUE;
        shortTest--;
        System.out.println("Short Underflow:  + Short.MIN_VALUE +  - 1 = " + shortTest);
        System.out.println();

        // CHAR Overflow & Underflow
        char charTest = Character.MAX_VALUE;
        charTest++;
        System.out.println("Char Overflow:  + Character.MAX_VALUE +  + 1 = " + (int) charTest);
        charTest = Character.MIN_VALUE;
        charTest--;
        System.out.println("Char Underflow:  + Character.MIN_VALUE +  - 1 = " + (int) charTest);
        System.out.println();

        // INTEGER Overflow & Underflow
        int intTest = Integer.MAX_VALUE;
        intTest++;
        System.out.println("Integer Overflow:  + Integer.MAX_VALUE +  + 1 = " + intTest);
        intTest = Integer.MIN_VALUE;
        intTest--;
        System.out.println("Integer Underflow:  + Integer.MIN_VALUE +  - 1 = " + intTest);
        System.out.println();

        // LONG Overflow & Underflow
        long longTest = Long.MAX_VALUE;
        longTest++;
        System.out.println("Long Overflow:  + Long.MAX_VALUE +  + 1 = " + longTest);
        longTest = Long.MIN_VALUE;
        longTest--;
        System.out.println("Long Underflow:  + Long.MIN_VALUE +  - 1 = " + longTest);
        System.out.println();

        // FLOAT Overflow & Underflow
        float floatTest = Float.MAX_VALUE;
        floatTest++;
        System.out.println("Float Overflow:  + Float.MAX_VALUE +  + 1 = " + floatTest);
        System.out.println("Float Overflow:  + Float.MAX_VALUE +  ^ 2 = " + floatTest * floatTest);
        floatTest = Float.MIN_VALUE;
        floatTest--;
        System.out.println("Float Underflow:  + Float.MIN_VALUE +  - 1 = " + floatTest);
        System.out.println();

        // DOUBLE Overflow & Underflow
        double doubleTest = Double.MAX_VALUE;
        doubleTest++;
        System.out.println("Double Overflow:  + Double.MAX_VALUE +  + 1 = " + doubleTest);
        System.out.println("Double Overflow:  + Double.MAX_VALUE +  ^ 2 = " + doubleTest * doubleTest);
        doubleTest = Double.MIN_VALUE;
        doubleTest--;
        System.out.println("Double Underflow:  + Double.MIN_VALUE +  - 1 = " + doubleTest);
        System.out.println();
    }

}
