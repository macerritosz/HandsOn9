public class SingletonMain {
    public static void main(String[] args) {
        SingletonLogger logger = SingletonLogger.getInstance();
        logger.Log(LogLevel.COMMENT, "Comment Singleton Message Log");
        logger.Log(LogLevel.WARN, "Warning Singleton Message Log");
        logger.Log(LogLevel.ERROR, "Error Singleton Message, Stopping...");
    }
}
