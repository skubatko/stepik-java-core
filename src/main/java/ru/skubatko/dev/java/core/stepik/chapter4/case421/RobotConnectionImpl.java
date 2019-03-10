package ru.skubatko.dev.java.core.stepik.chapter4.case421;

public class RobotConnectionImpl implements RobotConnection {


    @Override
    public void moveRobotTo(int x, int y) {

    }

    @Override
    public void close() {
        throw new IllegalArgumentException("close");
    }
}
