package F_UcuncuGunOdevler.C_Polymorphism_38;

public class Main {
    public static void main(String[] args) {

        BaseLogger[] baseLoggers = new BaseLogger[]{new FileLogger(),new DatabaseLogger(),new EmailLogger(),new ConsoleLogger()};

//        for (BaseLogger logger: baseLoggers
//             ) {
//            logger.log("Selam");
//
//        }

        CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
        customerManager.add();

    }
}
