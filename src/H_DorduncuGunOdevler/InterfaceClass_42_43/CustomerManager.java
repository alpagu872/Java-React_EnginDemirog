package H_DorduncuGunOdevler.InterfaceClass_42_43;


public class CustomerManager {

    private ICustomerDal customerDal;

    public CustomerManager(ICustomerDal customerDal) {
        this.customerDal = customerDal;
    }

    public void add() {
        // iş kodları
        customerDal.add();

    }
}
