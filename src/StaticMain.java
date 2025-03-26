public class StaticMain {
    public static void main(String[] args) {
        StaticLogger.Log(LogLevel.COMMENT, "Comment Singleton Message Log");
        StaticLogger.Log(LogLevel.WARN, "Warning Singleton Message Log");
        StaticLogger.Log(LogLevel.ERROR, "Error Singleton Message, Stopping...");
    }
}
