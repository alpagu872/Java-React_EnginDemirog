package F_UcuncuGunOdevler.C_Polymorphism_38;

public class EmailLogger extends BaseLogger {
    @Override
    public void log(String message){
        System.out.println("Log to Mail : " + message);
    }
}
