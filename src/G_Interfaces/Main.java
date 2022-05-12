package G_Interfaces;

public class Main {
    public static void main(String[] args) {
        Logger[] loggers = new Logger[]{new DatabaseLogger(),new EmailLogger(),new SmsLogger(), new FileLogger()};


        CustomerManager customerManager = new CustomerManager(loggers);


        Customer hasanAkgun = new Customer(1, "Hasan", "Akgün");
        customerManager.add(hasanAkgun);
    }
}
