package F_UcuncuGunOdevler.A_Inheritance_36;

public class EmployeeManager extends PersonManager {
    public void bestEmployee(Person person) {
        System.out.println("Ayın elemanı getirildi. " + person.firstName);
    }
}
