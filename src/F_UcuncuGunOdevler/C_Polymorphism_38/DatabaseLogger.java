package F_UcuncuGunOdevler.C_Polymorphism_38;

public class DatabaseLogger extends BaseLogger {
    @Override
    public void log(String message){
        System.out.println("Log to database: " + message);
    }
}
