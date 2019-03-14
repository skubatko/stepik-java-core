package ru.skubatko.dev.java.core.stepik.chapter3.case352;

public class AsciiCharSequenceImmutable implements CharSequence {

    private byte[] data;

    public AsciiCharSequenceImmutable(byte[] data) {
        this.data = data.clone();
//        System.arraycopy(data, 0, this.data, 0, data.length);
    }

    public void mutate() {
        for (int i = 0; i < data.length; i++) {
            data[i] = 1;
        }
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
        return new AsciiCharSequenceImmutable(newData);
    }

    @Override
    public String toString() {
        return new String(data);
    }

}
