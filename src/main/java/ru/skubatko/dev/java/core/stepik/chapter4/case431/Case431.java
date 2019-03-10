package ru.skubatko.dev.java.core.stepik.chapter4.case431;


import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.XMLFormatter;

public class Case431 {

    private static final Logger LOGGER_A = Logger.getLogger("org.stepic.java.logging.ClassA");
    private static final Logger LOGGER_B = Logger.getLogger("org.stepic.java.logging.ClassB");
    private static final Logger LOGGER_DOMAIN = Logger.getLogger("org.stepic.java");

    private static void configureLogging() {

        LOGGER_A.setLevel(Level.ALL);
        LOGGER_B.setLevel(Level.WARNING);

        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setFormatter(new XMLFormatter());
        consoleHandler.setLevel(Level.ALL);
        LOGGER_DOMAIN.addHandler(consoleHandler);
        LOGGER_DOMAIN.setUseParentHandlers(false);
    }

}
