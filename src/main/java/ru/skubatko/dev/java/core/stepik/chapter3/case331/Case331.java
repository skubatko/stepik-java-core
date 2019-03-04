package ru.skubatko.dev.java.core.stepik.chapter3.case331;

public class Case331 {

    public static void moveRobot(Robot robot, int toX, int toY) {
        int dx = toX - robot.getX();
        int dy = toY - robot.getY();

        Direction xDirection = dx > 0 ? Direction.RIGHT : Direction.LEFT;
        Direction yDirection = dy > 0 ? Direction.UP : Direction.DOWN;

        turnRobot(robot,xDirection);
        for (int i = 0; i < Math.abs(dx); i++) robot.stepForward();

        turnRobot(robot,yDirection);
        for (int i = 0; i < Math.abs(dy); i++) robot.stepForward();
    }

    private static void turnRobot(Robot robot, Direction direction) {
        if (robot.getDirection() == direction) return;
        robot.turnRight();
        turnRobot(robot, direction);
    }

}
