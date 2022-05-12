package C_IlkDersOdevler.SayiBulma;

public class Main {
    public static void main(String[] args) {

        int[] sayilar = {1, 2, 3, 4, 5, 6};
        int aranan = 7;
        boolean varMi = false;

        for (int i = 0; i < sayilar.length; i++) {
            if (sayilar[i] == aranan) {
                varMi = true;
                break;
            }
        }
        if (varMi == true) {
            System.out.println("Aranan sayı dizide mevcut");
        } else {
            System.out.println("Sayi Yok");
        }
    }
}
