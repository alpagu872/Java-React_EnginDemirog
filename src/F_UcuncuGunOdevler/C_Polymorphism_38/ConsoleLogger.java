package F_UcuncuGunOdevler.C_Polymorphism_38;

public class ConsoleLogger extends BaseLogger{
    @Override
    public void log(String message){
        System.out.println("Log to console: " + message);
     }
}
