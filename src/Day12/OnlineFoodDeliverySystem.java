package Day12;

abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;
    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
    public String getItemName() {
        return itemName;
    }
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public abstract double calculateTotalPrice();
    public void getItemDetails() {
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
    }
}
interface Discountable {
    double applyDiscount();
    String getDiscountDetails();
}
class VegItem extends FoodItem implements Discountable {
    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }
    public double calculateTotalPrice() {
        return getPrice() * getQuantity() - applyDiscount();
    }
    public double applyDiscount() {
        return getPrice() * getQuantity() * 0.05;
    }
    public String getDiscountDetails() {
        return "5% discount on veg items";
    }
    public void getItemDetails() {
        super.getItemDetails();
        System.out.println(getDiscountDetails());
    }
}
class NonVegItem extends FoodItem implements Discountable {
    private double additionalCharge = 50;
    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }
    public double calculateTotalPrice() {
        return (getPrice() * getQuantity() + additionalCharge) - applyDiscount();
    }
    public double applyDiscount() {
        return getPrice() * getQuantity() * 0.1;
    }
    public String getDiscountDetails() {
        return "10% discount on non-veg items";
    }
    public void getItemDetails() {
        super.getItemDetails();
        System.out.println("Additional Charge: " + additionalCharge);
        System.out.println(getDiscountDetails());
    }
}
public class OnlineFoodDeliverySystem {
    public static void main(String[] args) {
        FoodItem vegItem = new VegItem("Paneer Tikka", 200, 2);
        FoodItem nonVegItem = new NonVegItem("Chicken Biryani", 300, 1);
        FoodItem[] items = {vegItem, nonVegItem};
        for (FoodItem item : items) {
            item.getItemDetails();
            System.out.println("Total Price: " + item.calculateTotalPrice());
            System.out.println();
        }
    }
}
