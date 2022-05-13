package H_DorduncuGunOdevler.AbstractClass_40;

public class Main {
    public static void main(String[] args) {
        WomanGameCalculator womanGameCalculator = new WomanGameCalculator();
        ManGameCalculator manGameCalculator = new ManGameCalculator();
        womanGameCalculator.hesapla();
        womanGameCalculator.gameOver();
        manGameCalculator.hesapla();

        //Abstract sınıflar newlenemez.

        BaseGameCalculator baseGameCalculator = new WomanGameCalculator();
    }
}
