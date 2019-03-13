package ru.skubatko.dev.java.core.stepik.chapter4.case421;

public class Case421 {

    public static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) {
        boolean moved = false;
        int attempt = 0;
        RuntimeException exp = null;
        do {
            attempt++;
            try (RobotConnection connection = robotConnectionManager.getConnection()) {
                connection.moveRobotTo(toX, toY);
                moved = true;
            } catch (RobotConnectionException e) {
                System.out.println("connection exception");
            } catch (RuntimeException e) {
                exp = e;
            }

            if (exp != null) {
                throw exp;
            }
        } while (!moved && attempt < 3);
        if (!moved) {
            throw new RobotConnectionException("Robot is not available");
        }
    }

    public static void main(String[] args) throws Exception {
        moveRobot(new RobotConnectionManagerImpl(), 0, 0);
    }

}
