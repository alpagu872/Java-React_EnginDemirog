package H_DorduncuGunOdevler.AbstractClassDemo_41;

public class CustomerManager {

    BaseDatabaseManager databaseManager;

    public void getCustomers(){
        this.databaseManager.getData();
    }
}
