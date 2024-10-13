public class ShippingService {
    public double calculateShippingCost(Product product) {
        System.out.println("Calculating shipping cost for: " + product.getName());
        return 10.0;
    }

    public void shipProduct(Product product) {
        System.out.println("Shipping product: " + product.getName());
    }
}
