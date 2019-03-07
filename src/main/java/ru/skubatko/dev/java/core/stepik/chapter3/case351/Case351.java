package ru.skubatko.dev.java.core.stepik.chapter3.case351;

import java.util.function.DoubleUnaryOperator;

public class Case351 {

    public static final int INITIAL_NUMBER_OF_STEPS = 10;
    public static final double DEVIATION = 1.0e-6;

    public static double integrate(DoubleUnaryOperator f, double a, double b) {
        double result = 0.0;
        double lastResult;
        int numberOfSteps = INITIAL_NUMBER_OF_STEPS;
        do {
            lastResult = result;
            result = 0.0;
            double step =  (b - a) / numberOfSteps;
            for (int i = 0; i < numberOfSteps; i++)
                result += f.applyAsDouble(a + i * step);
            result *= step;
            numberOfSteps *= 2;
        } while (Math.abs(result - lastResult) >= DEVIATION);
        return result;
    }

}
