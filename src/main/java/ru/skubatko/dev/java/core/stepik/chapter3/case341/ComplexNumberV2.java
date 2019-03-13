package ru.skubatko.dev.java.core.stepik.chapter3.case341;

public final class ComplexNumberV2 {
    private final double re;
    private final double im;

    public ComplexNumberV2(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof ComplexNumberV2)) {
            return false;
        }

        ComplexNumberV2 complexNumberV2 = (ComplexNumberV2) o;
        return (Double.compare(re, complexNumberV2.re) == 0)
                && (Double.compare(im, complexNumberV2.im) == 0);

    }

    @Override
    public int hashCode() {
        int result = 17;
        long l = 0L;

        l = Double.doubleToLongBits(re);
        result += 31 * result + (int) (l ^ (l >>> 32));

        l = Double.doubleToLongBits(im);
        result += 31 * result + (int) (l ^ (l >>> 32));

        return result;
    }

    @Override
    public String toString() {
        return "re=" + re + ", im=" + im;
    }
}
