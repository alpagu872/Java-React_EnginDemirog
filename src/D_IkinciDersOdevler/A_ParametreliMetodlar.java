package D_IkinciDersOdevler;

public class A_ParametreliMetodlar {
    public static void main(String[] args) {

        String mesaj = "Bugün hava çok güzel";
        String yeniMesaj = mesaj.substring(0, 7);
        String yeniMesaj1 = sehirVer();
        int sayi = topla(5,8);



        System.out.println(yeniMesaj);
    }

    public static void ekle() {
        System.out.println("Eklendi.");
    }

    private static void sil() {
        System.out.println("Silindi.");
    }

    public static void guncelle() {
        System.out.println("Güncellendi.");
    }

    public static int topla(int a , int b) {

        return a+b;
    }

    public static String sehirVer() {
        return "Ankara";
    }

}
