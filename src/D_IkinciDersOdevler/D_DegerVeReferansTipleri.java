package D_IkinciDersOdevler;

public class D_DegerVeReferansTipleri {
    public static void main(String[] args) {
        //Classlar referans tiptir.
        C_CustomerManager customerManager = new C_CustomerManager();
        C_CustomerManager customerManager2 = new C_CustomerManager();
        customerManager = customerManager2;
        customerManager.Add();
        customerManager.Remove();
        customerManager.Update();

        //Value -Değer- type
        int sayi1 = 10;
        int sayi2 = 20;
        sayi2 = sayi1;
        sayi1 = 30;
        System.out.println(sayi2);


        int[] sayilar1 = new int[]{1, 2, 3};
        int[] sayilar2 = new int[]{4, 5, 6};

        sayilar2 = sayilar1;
        sayilar1[0] = 10;
        System.out.println(sayilar2[0]);

    }
}
