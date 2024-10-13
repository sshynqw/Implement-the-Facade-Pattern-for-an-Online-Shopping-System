public class ShoppingFacade {
    private ProductCatalog productCatalog;
    private PaymentProcessor paymentProcessor;
    private InventoryManager inventoryManager;
    private ShippingService shippingService;

    public ShoppingFacade() {
        productCatalog = new ProductCatalog();
        paymentProcessor = new PaymentProcessor();
        inventoryManager = new InventoryManager();
        shippingService = new ShippingService();
    }

    public void placeOrder(String productName, String paymentDetails) {
        Product product = productCatalog.searchProduct(productName);

        if (inventoryManager.checkStock(product)) {
            double shippingCost = shippingService.calculateShippingCost(product);
            double totalAmount = product.getPrice() + shippingCost;

            if (paymentProcessor.processPayment(paymentDetails, totalAmount)) {
                inventoryManager.updateInventory(product);
                shippingService.shipProduct(product);
                System.out.println("Order placed successfully for " + productName);
            } else {
                System.out.println("Payment failed. Order cannot be completed.");
            }
        } else {
            System.out.println("Product out of stock.");
        }
    }
}
