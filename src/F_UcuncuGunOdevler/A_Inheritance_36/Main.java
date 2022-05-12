package F_UcuncuGunOdevler.A_Inheritance_36;

public class Main {
    public static void main(String[] args) {

        Customer hasanMusteri = new Customer();
        hasanMusteri.firstName = "Hasan";
        hasanMusteri.lastName = "Akgün";
        hasanMusteri.id = 1;
        hasanMusteri.email = "Crazyboy_ceza_hasan@hotmail.com.tr";

        Employee isci = new Employee();
        isci.firstName = "Falan";
        isci.age = 21;
        isci.salary = 12213;


        CustomerManager customerManager = new CustomerManager();
        customerManager.add(hasanMusteri);
        customerManager.list();

        EmployeeManager employeeManager = new EmployeeManager();
        employeeManager.bestEmployee(isci);
        employeeManager.list();
    }
}
