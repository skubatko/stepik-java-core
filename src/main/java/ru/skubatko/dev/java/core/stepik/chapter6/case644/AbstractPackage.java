package ru.skubatko.dev.java.core.stepik.chapter6.case644;

public class AbstractPackage<T> {

    private String from;
    private String to;
    private T content;

    public AbstractPackage(String from, String to, T content) {
        this.from = from;
        this.to = to;
        this.content = content;
    }

    public T getContent() {
        return content;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

}
