package B_oopIntro;

public class Main2 {
    public static void main(String[] args) {

        Product product1 = new Product(1, "MSI GE75 RAIDER ", 15000, "128 GB RAM", 10); // Referans oluşturma, instance

        Product product2 = new Product(2, "LENOVO V15", 7500, "64 GB  RAM", 5); // Referans oluşturma, instance
//        product2.id = 2;
//        product2.name = "LENOVO V14";
//        product2.unitPrice = 13000;
//        product2.detail = "32 GB RAM";

        Product product3 = new Product(3, "LENOVO V14", 4500, "16 GB RAM", 10); // Referans oluşturma, instance
//        product3.id = 3;
//        product3.name = "MSI GE 75 RAIDER";
//        product3.unitPrice = 21000;
//        product3.detail = "32 GB RAM";


        Product[] products = {product1, product2, product3};


        for (Product product : products) {
            System.out.println(product.getName());
        }

        System.out.println(products.length);

        Category category1 = new Category();
        category1.setId(1);
        category1.setName("Bilgisayar");

        Category category2 = new Category();
        category2.setId(2);
        category2.setName("Ev, Bahçe");

        ProductManager productManager = new ProductManager();
        productManager.addToCart(product1);
        productManager.addToCart(product2);
        productManager.addToCart(product3);

        System.out.println(product1.getUnitPriceAfterDiscount());
        System.out.println(product2.getUnitPriceAfterDiscount());
        System.out.println(product3.getUnitPriceAfterDiscount());

        System.out.println();

        System.out.println(category1.getName());
        System.out.println(category2.getName());

    }
}
