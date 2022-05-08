package IlkDersOdevler.MukemmelSayilar;

public class Main {
    public static void main(String[] args) {
        int sayi = 6,toplam = 0;

        for (int i = 1 ; i < sayi;i++){
            if (sayi % i == 0){
                toplam+=i;
            }
        }

        if (toplam == sayi){
            System.out.println("Mükemmel Sayı.");
        }else {
            System.out.println("Mükemmel Sayı Değil.");
        }
    }
}
