package F_UcuncuGunOdevler.E_KodlamaIo;

public class UserManager {
    public void add(User user){
        System.out.println("Kişi eklendi :" + user.userName);
    }

    public void remove(User user){
        System.out.println("Kişi silindi: " + user.userName);

    }
}
