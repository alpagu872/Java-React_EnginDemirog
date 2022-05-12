package E_Inheritance;

public class Main {
    public static void main(String[] args) {

        IndividualCustomer hasan = new IndividualCustomer();
        hasan.customerNumber = "12345";

        CorporateCustomer hepsiBurada = new CorporateCustomer();
        hepsiBurada.companyName = "Hepsi Burada";
        hepsiBurada.customerNumber = "554488";

        CustomerManager customerManager = new CustomerManager();
//        customerManager.add(hepsiBurada);
//        customerManager.add(hasan);

        UnionCustomer unionCustomer = new UnionCustomer();
        unionCustomer.customerNumber = "25";

        Customer[] customers = new Customer[]{hasan,hepsiBurada,unionCustomer};
        customerManager.addMultiple(customers);


    }


}
