public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        String[] krediler = {
                "falan Kredi",
                "Alpagu Kredisi",
                "Falanca Kredi"
        };
        for (String kredi : krediler){
            System.out.println(kredi);
        }

        int[] sayilar1 = {1,2,3,4,5};
        int[] sayilar2 = {10,20,30,40,50};
        sayilar1 = sayilar2;
        sayilar2[0] = 100;
        System.out.println(sayilar1[0]);

    }
}