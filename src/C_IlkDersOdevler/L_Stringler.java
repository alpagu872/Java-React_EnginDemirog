package C_IlkDersOdevler;

public class L_Stringler {
    public static void main(String[] args) {
        String mesaj = "Bugün hava çok güzel.";

        System.out.println(mesaj);

//        System.out.println("Eleman sayısı: " + mesaj.length());
//        System.out.println("5.Eleman: " + mesaj.charAt(4));
//        System.out.println(mesaj.concat(" Hahayt!"));
//
//        System.out.println(mesaj.startsWith("B"));
//        System.out.println(mesaj.startsWith("A"));
//
//        System.out.println(mesaj.endsWith("."));
//        char[] karakterler = new char[5];
//        mesaj.getChars(0,5,karakterler,0);
//        for (int i = 0 ; i < karakterler.length; i++){
//            System.out.println(karakterler[i]);
//        }
//
//        System.out.println(mesaj.indexOf('a'));
//        System.out.println(mesaj.lastIndexOf('a'));


        System.out.println(mesaj.replace(' ', '-'));
        System.out.println(mesaj);
        System.out.println(mesaj.substring(2,4));

        System.out.println();

        for (String kelime : mesaj.split(" ")){
            System.out.println(kelime);
        }
        System.out.println();

        System.out.println(mesaj.toUpperCase());
        System.out.println(mesaj.toLowerCase());

        System.out.println(mesaj.trim());


    }
}
