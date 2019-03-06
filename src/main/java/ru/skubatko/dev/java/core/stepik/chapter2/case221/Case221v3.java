package ru.skubatko.dev.java.core.stepik.chapter2.case221;

public class Case221v3 {

    public static char charExpression(int a) {
        return (char) ('\\' + a);
    }

    public static void main(String[] args) {
        byte b = 1;
        short s = b;
        char c = (char) b;
        int i = b;
        long l = b;
        float f = l;
        double d = l;
//        boolean = b;
        boolean boo = true;

        byte bc = (byte) c;
        byte bi = (byte) i;
        byte bb = (byte) (b + b);

        short shi = (short) i;
        short shc = (short) c;

        c = '1';
        char cc = (char) (c + c);
        System.out.println(c);
        System.out.println((int) c);
        System.out.println(cc);
        System.out.println(cc + 1);
        System.out.println("1" + 1);
        System.out.println("1" + 1 + 1);
        System.out.println("1" + (1 + 1));
        char cci = (char) (cc + i);
        System.out.println(cci);
        int ici = cc + i;
        System.out.println(ici);

        long lb = b;
        long ls = s;
        long lc = c;
        long li = i;
        long lf = (long) f;
        long ld = (long) d;

        float fb = b;
        float fc = c;
        float fd = (float) d;

        double db = b;
        double ds = s;
        double dc = c;
        double di = i;
        double dl = l;
        double df = f;
//        double dboo = boo;

        System.out.println("<< the END >>");
    }

}
