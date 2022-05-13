package H_DorduncuGunOdevler.InterfaceClass_42_43;

public class MySQLCustomerDal implements ICustomerDal, IRepostory {
    @Override
    public void add() {
        System.out.println("MySQL üzerine müşteri eklendi. ");
    }
}
