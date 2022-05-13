package H_DorduncuGunOdevler.StaticDemo_45;

public class ProductManager {

    static {
        System.out.println("Statik yapıcı blok çalıştı.");
    }

    public void add(Product product) {
        if (ProductValidator.isValid(product)) {
            System.out.println("Ürün eklendi.");
        } else {
            System.out.println("Ürün eklenemedi.");
        }
    }
}
