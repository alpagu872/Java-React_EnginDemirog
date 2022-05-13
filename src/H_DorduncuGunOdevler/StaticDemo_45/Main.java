package H_DorduncuGunOdevler.StaticDemo_45;

public class Main {
    public static void main(String[] args) {

        ProductManager productManager = new ProductManager();
        Product product = new Product();
        product.name = "Ürün adı.";
        product.price = 1;

        productManager.add(product);


        DatabaseHelper.Crud.delete();
        DatabaseHelper.Connection.createConnection();

    }
}
