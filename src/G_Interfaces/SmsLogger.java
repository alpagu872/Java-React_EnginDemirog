package G_Interfaces;

public class SmsLogger implements Logger {
    @Override
    public void log(String message) {
        System.out.println("Log to SMS: " + message);
    }
}
