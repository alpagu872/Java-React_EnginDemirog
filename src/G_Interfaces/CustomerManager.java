package G_Interfaces;

public class CustomerManager {

    private Logger[] loggers;

    public CustomerManager(Logger[] loggers) {
        this.loggers = loggers;
    }

    //loosely - tightly coupled
    public void add(Customer customer) {
        System.out.println("Müşteri eklendi: " + customer.getFirstName());


        Utils.runLoggers(loggers, customer.getFirstName());


    }

    public void delete(Customer customer) {
        System.out.println("Müşteri kaldırıldı: " + customer.getFirstName());

        Utils.runLoggers(loggers, customer.getFirstName());

    }

}
