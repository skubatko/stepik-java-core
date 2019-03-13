package ru.skubatko.dev.java.core.stepik.chapter4.case421;

public class RobotConnectionManagerImpl implements RobotConnectionManager {
    @Override
    public RobotConnection getConnection() {
//        throw new RobotConnectionException("connection lost");
        return new RobotConnectionImpl();
    }
}
