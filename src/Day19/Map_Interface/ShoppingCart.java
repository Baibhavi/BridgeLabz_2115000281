package Day19.Map_Interface;
import java.util.*;
public class ShoppingCart {
    private Map<String, Double> productPriceMap = new HashMap<>();
    private Map<String, Integer> cartItemsMap = new LinkedHashMap<>();
    private SortedMap<Double, String> sortedItemsMap = new TreeMap<>();
    public void addProductToStore(String product, double price) {
        productPriceMap.put(product, price);
    }
    public void addItemToCart(String product, int quantity) {
        if (!productPriceMap.containsKey(product)) {
            System.out.println("Product not found in store: " + product);
            return;
        }
        cartItemsMap.put(product, cartItemsMap.getOrDefault(product, 0) + quantity);
        sortedItemsMap.put(productPriceMap.get(product), product);
    }
    public void displayCartItemsInOrder() {
        System.out.println("Items in the cart (in order added):");
        for (Map.Entry<String, Integer> entry : cartItemsMap.entrySet()) {
            System.out.println("Product: " + entry.getKey() + ", Quantity: " + entry.getValue());
        }
    }
    public void displayCartItemsSortedByPrice() {
        System.out.println("Items in the cart (sorted by price):");
        for (Map.Entry<Double, String> entry : sortedItemsMap.entrySet()) {
            String product = entry.getValue();
            System.out.println("Product: " + product + ", Price: " + entry.getKey() + ", Quantity: " + cartItemsMap.get(product));
        }
    }
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addProductToStore("Laptop", 1000.00);
        cart.addProductToStore("Headphones", 50.00);
        cart.addProductToStore("Mouse", 25.00);
        cart.addItemToCart("Laptop", 1);
        cart.addItemToCart("Headphones", 2);
        cart.addItemToCart("Mouse", 3);
        cart.displayCartItemsInOrder();
        System.out.println();
        cart.displayCartItemsSortedByPrice();
    }
}
