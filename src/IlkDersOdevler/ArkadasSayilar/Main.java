package IlkDersOdevler.ArkadasSayilar;

public class Main {
    public static void main(String[] args) {
        int sayi1 = 220, sayi2 = 284, total1 = 0, total2 = 0;


        for (int i = 1; i < sayi1; i++) {
            if (sayi1 % i == 0) {
                total1 += i;
            }
        }
        for (int i = 1; i < sayi2; i++) {
            if (sayi2 % i == 0) {

                total2 += i;
            }
        }

        if (total1 == sayi2 && total2 == sayi1) {
            System.out.println("Arkadaş sayılardır.");
        } else {
            System.out.println("Arkadaş sayı değillerdir.");
        }


    }
}
