package ru.skubatko.dev.java.core.stepik.chapter4.case421;

public class Case421v2 {

    public static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) {
        boolean moved = false;
        RuntimeException runtimeException = null;
        for (int i = 0; i < 3; i++) {
            RobotConnection connection = null;
            try {
                connection = robotConnectionManager.getConnection();
                connection.moveRobotTo(toX, toY);
                moved = true;
            } catch (RobotConnectionException e) {
                System.out.println("connection exception");
            } catch (RuntimeException e) {
                runtimeException = e;
            } finally {
                if (connection != null) {
                    try {
                        connection.close();
                    } catch (RuntimeException e) {
                    }
                }
            }
            if (runtimeException != null) {
                throw runtimeException;
            }
            if (moved) {
                break;
            }
        }
        if (!moved) {
            throw new RobotConnectionException("Robot is not available");
        }
    }

    public static void main(String[] args) throws Exception {
        moveRobot(new RobotConnectionManagerImpl(), 0, 0);
    }

}
