package F_UcuncuGunOdevler.C_Polymorphism_38;

public class FileLogger extends BaseLogger {
    @Override
    public void log(String message){
        System.out.println("Log to File: " + message);
    }
}
