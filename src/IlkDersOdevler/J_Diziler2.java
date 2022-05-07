package IlkDersOdevler;

public class J_Diziler2 {
    public static void main(String[] args) {
        double[] myList = {1.2, 1.3, 1.4, 1.5};
        double total = 0;
        for (double number : myList) {
            total += number;
            System.out.println(number);

        }
        System.out.println("Toplam: " + total);
    }
}
