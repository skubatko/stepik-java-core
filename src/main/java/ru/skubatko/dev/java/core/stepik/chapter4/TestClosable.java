package ru.skubatko.dev.java.core.stepik.chapter4;

public class TestClosable implements AutoCloseable {
    @Override
    public void close() throws Exception {
        System.out.println("close");
        throw new Exception("_______ close Exception _______");
    }
}
