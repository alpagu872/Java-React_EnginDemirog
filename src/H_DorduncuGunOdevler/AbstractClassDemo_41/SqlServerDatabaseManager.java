package H_DorduncuGunOdevler.AbstractClassDemo_41;

public class SqlServerDatabaseManager extends BaseDatabaseManager {
    @Override
    public void getData() {
        System.out.println("SQL üzerinden veri çekildi.");
    }
}
