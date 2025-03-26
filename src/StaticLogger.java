public class StaticLogger {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_RED = "\u001B[31m";

    public static void Log(LogLevel level, String message) {
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