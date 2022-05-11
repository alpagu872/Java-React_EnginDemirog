package oopIntro;

public class Main2 {
    public static void main(String[] args) {

        Product product1 = new Product(1, "LENOVO V15", 15000, "16 GB RAM"); // Referans oluşturma, instance

        Product product2 = new Product(); // Referans oluşturma, instance
        product2.id = 2;
        product2.name = "LENOVO V14";
        product2.unitPrice = 13000;
        product2.detail = "32 GB RAM";

        Product product3 = new Product(); // Referans oluşturma, instance
        product3.id = 3;
        product3.name = "MSI GE 75 RAIDER";
        product3.unitPrice = 21000;
        product3.detail = "32 GB RAM";


        Product[] products = {product1, product2, product3};


        for (Product product : products) {
            System.out.println(product.name);

        }

        System.out.println(products.length);

        Category category1 = new Category();
        category1.id = 1;
        category1.name = "Bilgisayar";

        Category category2 = new Category();
        category2.id = 2;
        category2.name = "Ev, Bahçe";

        ProductManager productManager = new ProductManager();
        productManager.addToCart(product1);
        productManager.addToCart(product2);
        productManager.addToCart(product3);

    }
}
