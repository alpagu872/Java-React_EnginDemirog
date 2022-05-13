package H_DorduncuGunOdevler.InterfaceClass_42_43;

public class SqlCustomerDal implements ICustomerDal{
    @Override
    public void add() {
        System.out.println("Sql üzerine müşteri eklendi.");
    }
}
