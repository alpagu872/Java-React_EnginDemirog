package G_Interfaces;

public class FileLogger implements Logger {
    @Override
    public void log(String message) {
        System.out.println("Log to File: " + message);
    }
}
