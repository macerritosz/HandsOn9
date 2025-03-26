package java.main;
import java.io.*;

public final class SingletonLogger {

    private static volatile SingletonLogger instance;
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_RED = "\u001B[31m";

    private SingletonLogger() {}

    public static SingletonLogger getInstance() {
        SingletonLogger result = instance;
        if (result == null) {
            synchronized (SingletonLogger.class) {
                if(instance == null) {
                    instance = new SingletonLogger();
                }
                result = instance;
            }
        }
        return result;
    }

    public void Log(LogLevel level, String message) {
        switch(level) {
            case ERROR:
                System.out.println(ANSI_RED + "Error: " + message + ANSI_RESET);
                System.exit(1);
                break;
            case WARN:
                System.out.println(ANSI_YELLOW + "Warning: " + message + ANSI_RESET);
                break;
            case COMMENT:
                System.out.println("Comment: " + message);
                break;
        }
    }
}
