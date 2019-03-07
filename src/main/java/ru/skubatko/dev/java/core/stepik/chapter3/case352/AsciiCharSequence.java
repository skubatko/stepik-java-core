package ru.skubatko.dev.java.core.stepik.chapter3.case352;

public class AsciiCharSequence implements CharSequence {

    private byte[] data;

    public AsciiCharSequence(byte[] data) {
        this.data = data;
    }

    @Override
    public int length() {
        return data.length;
    }

    @Override
    public char charAt(int index) {
        return (char) data[index];
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        int length = end - start;
        byte[] newData = new byte[length];
        System.arraycopy(data, start, newData, 0, length);
        return new AsciiCharSequence(newData);
    }

    @Override
    public String toString() {
        return new String(data);
    }

}
