package ru.skubatko.dev.java.core.stepik.chapter3.case331;

public class Case331v2 {

    public static void moveRobot(Robot robot, int toX, int toY) {
        int dx = toX - robot.getX();
        int dy = toY - robot.getY();

        Direction xDirection = dx > 0 ? Direction.RIGHT : Direction.LEFT;
        Direction yDirection = dy > 0 ? Direction.UP : Direction.DOWN;

        int numberOfTurnX = getNumberOfTurns(robot, xDirection);
        int numberOfTurnY = getNumberOfTurns(robot, yDirection);

        if (numberOfTurnX <= numberOfTurnY) {
            go(robot, xDirection, dx);
            go(robot, yDirection, dy);
        } else {
            go(robot, yDirection, dy);
            go(robot, xDirection, dx);
        }
    }

    private static void go(Robot robot, Direction direction, int numberOfSteps) {
        turnRobot(robot, direction);
        for (int i = 0; i < Math.abs(numberOfSteps); i++) robot.stepForward();
    }

    private static int getNumberOfTurns(Robot robot, Direction direction) {
        Direction currentDirection = robot.getDirection();

        if (currentDirection == direction) return 0;

        if (isTurnClockwise(direction, currentDirection)) return 1;
        if (isTurnCounterClockwise(direction, currentDirection)) return 1;

        return 2;
    }

    private static void turnRobot(Robot robot, Direction direction) {
        Direction currentDirection = robot.getDirection();
        if (currentDirection == direction) return;

        if (isTurnClockwise(direction, currentDirection)) {
            robot.turnRight();
            return;
        }

        if (isTurnCounterClockwise(direction, currentDirection)) {
            robot.turnLeft();
            return;
        }

        robot.turnRight();
        robot.turnRight();
    }

    private static boolean isTurnClockwise(Direction direction, Direction currentDirection) {
        return currentDirection == Direction.UP && direction == Direction.RIGHT
                || currentDirection == Direction.RIGHT && direction == Direction.DOWN
                || currentDirection == Direction.DOWN && direction == Direction.LEFT
                || currentDirection == Direction.LEFT && direction == Direction.UP;
    }

    private static boolean isTurnCounterClockwise(Direction direction, Direction currentDirection) {
        return currentDirection == Direction.UP && direction == Direction.LEFT
                || currentDirection == Direction.LEFT && direction == Direction.DOWN
                || currentDirection == Direction.DOWN && direction == Direction.RIGHT
                || currentDirection == Direction.RIGHT && direction == Direction.UP;
    }

}
