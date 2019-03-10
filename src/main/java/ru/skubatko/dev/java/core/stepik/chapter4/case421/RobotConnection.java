package ru.skubatko.dev.java.core.stepik.chapter4.case421;

public interface RobotConnection extends AutoCloseable {

    void moveRobotTo(int x, int y);

    @Override
    void close();

}
