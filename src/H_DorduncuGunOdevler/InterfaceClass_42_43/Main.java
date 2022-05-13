package H_DorduncuGunOdevler.InterfaceClass_42_43;

public class Main {
    public static void main(String[] args) {

        CustomerManager customerManager = new CustomerManager(new SqlCustomerDal());

        customerManager.add();
    }
}
