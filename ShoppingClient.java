public class ShoppingClient {
    public static void main(String[] args) {
        ShoppingFacade shoppingFacade = new ShoppingFacade();
        shoppingFacade.placeOrder("Laptop", "Card1234");
    }
}
