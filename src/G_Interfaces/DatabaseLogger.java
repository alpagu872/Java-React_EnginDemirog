package G_Interfaces;

public class DatabaseLogger implements Logger {
    @Override
    public void log(String message) {
        System.out.println("Log to Database: " + message);
    }
}
