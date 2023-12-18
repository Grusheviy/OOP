package Controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static java.lang.Math.log;

public class Logger {

    private static void log(String level, String message) {
        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS"));
        System.out.printf("[%s] %s %s%n", timestamp, level, message);
    }

    public static void info(String operation, double x, double y, double result) {
        String logMessage = String.format("%s: %.2f and %.2f = %.2f", operation, x, y, result);
        log("INFO", logMessage);
    }
    public static void error(String message) {
        log("ERROR", message);
    }
}
