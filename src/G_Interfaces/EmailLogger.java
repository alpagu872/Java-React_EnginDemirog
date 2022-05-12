package G_Interfaces;

public class EmailLogger
        implements Logger {
    @Override
    public void log(String message) {
        System.out.println("Log to E-mail: " + message);

    }
}
