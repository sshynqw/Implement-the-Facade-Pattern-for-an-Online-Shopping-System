public class InventoryManager {
    public boolean checkStock(Product product) {
        System.out.println("Checking stock for: " + product.getName());
        return true;
    }

    public void updateInventory(Product product) {
        System.out.println("Updating inventory for: " + product.getName());
    }
}
