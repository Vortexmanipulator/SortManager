package com.sparta.dr.logging;

import java.io.IOException;
import java.util.logging.*;

public class Logging {
    public static Logger logger = Logger.getLogger("Info Logger");
    public static Logging setupLogger() {
        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setLevel(Level.ALL);
        logger.addHandler(consoleHandler);
        try {
            FileHandler fileHandler = new FileHandler("src/main/resources/mylog.log", true);
            fileHandler.setLevel(Level.ALL);
            fileHandler.setFormatter((new SimpleFormatter()));
            logger.addHandler(fileHandler);
        } catch (IOException e) {
            throw new RuntimeException(e);
//
        }
        return null;
    }

}
