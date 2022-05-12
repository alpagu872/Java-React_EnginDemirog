package G_Interfaces;

public class Utils {

    public static void runLoggers(Logger[] loggers, String message) {
        for (Logger logger2 : loggers) {
            logger2.log(message);
        }
    }

}
