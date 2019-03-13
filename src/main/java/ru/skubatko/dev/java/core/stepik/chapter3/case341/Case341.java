package ru.skubatko.dev.java.core.stepik.chapter3.case341;

public class Case341 {

    public static void main(String[] args) {
        ComplexNumber a = new ComplexNumber(1, 1);
        ComplexNumber b = new ComplexNumber(1, 1);

        System.out.println(a.equals(b));
        System.out.println(a.hashCode() == b.hashCode());

        double d = Double.MAX_VALUE / 2;
        long l = Double.doubleToLongBits(d);
        System.out.println(l);
        System.out.println(l >>> 32);
        System.out.println(l ^ (l >>> 32));
    }

}
