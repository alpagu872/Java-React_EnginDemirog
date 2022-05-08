package IlkDersOdevler.AsalSayiMi;

public class Main {
    public static void main(String[] args) {
        int a = 97, sayac = 0;
        for (int i = 2; i < a; i++) {
            if ((a % i == 0) && (i != a)) {
                sayac++;
            }
        }
        if (sayac == 0) {
            System.out.println(a + " asaldır.");
        } else {
            System.out.println(a + " asal değildir.");
        }
    }
}
