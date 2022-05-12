package F_UcuncuGunOdevler.C_Polymorphism_38;

public class CustomerManager {
    private BaseLogger logger;

    public CustomerManager(BaseLogger logger) {
        this.logger = logger;
    }

    public void add() {

        System.out.println("Müşteri eklendi.");
        this.logger.log("Log mesajı");

    }
}
