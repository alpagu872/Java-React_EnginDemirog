package D_IkinciDersOdevler;

public class F_classesWithAttributes {

    public static void main(String[] args) {
        FB_Product product = new FB_Product(1, "MSI", "Laptop", 50000, 5, "Mor");
//        product.setName("Laptop");
//        product.setId(1);
//        product.setDescription("MSI LAPTOP");
//        product.setPrice(60000);
//        product.setStockAmount(20);

        FC_ProductManager productManager = new FC_ProductManager();
        productManager.Add(product);
//        System.out.println(product.name);

        productManager.Add2(1, "", "", 4, 50);
        productManager.Add2(1, "", "", 4, 50);
        productManager.Add2(1, "", "", 4, 50);
        productManager.Add2(1, "", "", 4, 50);
        productManager.Add2(1, "", "", 4, 50);
    }


}
