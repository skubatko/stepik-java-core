package ru.skubatko.dev.java.core.stepik.chapter4.case421;

public class Case421v3 {

    public static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) {
        for (int i = 0; i < 3; i++) {
            RobotConnection connection = null;
            try {
                connection = robotConnectionManager.getConnection();
                connection.moveRobotTo(toX, toY);
                return;
            } catch (RobotConnectionException e) {
                System.out.println("connection exception");
            } finally {
                if (connection != null) {
                    try {
                        connection.close();
                    } catch (RuntimeException e) {
                        // no action
                    }
                }
            }
        }
        throw new RobotConnectionException("Robot is not available");
    }

    public static void main(String[] args) throws Exception {
        moveRobot(new RobotConnectionManagerImpl(), 0, 0);
    }

}
