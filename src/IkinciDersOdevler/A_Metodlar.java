package IkinciDersOdevler;

public class A_Metodlar {
    public static void main(String[] args) {
        sayiBul();
        mesajVer("HAHAHAHHA");
    }

    public static void sayiBul() {
        int[] sayilar = {1, 2, 3, 4, 5, 6};
        int aranan = 2;
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

    public static void mesajVer(String mesaj) {

        System.out.println("Mesaj: " + mesaj);
    }
}
