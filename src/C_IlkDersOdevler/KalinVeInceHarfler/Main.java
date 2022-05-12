package C_IlkDersOdevler.KalinVeInceHarfler;

public class Main {
    public static void main(String[] args) {
        String harf = "i";

        switch (harf.toUpperCase()){
            case "I","A","U","O":
                System.out.println( harf + " İnce Harf");
                break;
            case "İ","E","Ü","Ö":
                System.out.println( harf + " Kalın Harf");
                break;
            default:
                System.out.println("Normal");

        }

    }
}
