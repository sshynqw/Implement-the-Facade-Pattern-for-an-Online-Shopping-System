public class ProductCatalog {
    public Product searchProduct(String productName) {
        System.out.println("Searching for product: " + productName);
        return new Product(productName, 100.0);
    }
}
