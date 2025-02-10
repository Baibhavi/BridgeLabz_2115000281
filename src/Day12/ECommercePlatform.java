package Day12;
abstract class Product implements Taxable{
    private String productId, name;
    private double price;
    public Product(String productId, String name, double price){
        this.productId = productId;
        this.name = name;
        this.price = price;
    }
    public void setProductId(String productId) {
        this.productId = productId;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String getProductId(){
        return productId;
    }
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    public double calculateTax() {
        return 0;
    }

    @Override
    public String getTaxDetails() {
        return "No tax";
    }
    public abstract double calculateDiscount();
    public double calculateFinalPrice() {
        return getPrice() + calculateTax() - calculateDiscount();
    }
    public void displayDetails() {
        System.out.println("Product ID: " + productId);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price +"$");
        System.out.println("Discount: " + calculateDiscount() +"$");
        System.out.println("Tax: " + calculateTax()+"$");
        System.out.println("Final Price: " + calculateFinalPrice()+"$");
    }
}
interface Taxable{
    double calculateTax();
    String getTaxDetails();
}
class  Electronics extends Product implements Taxable{
    public Electronics(String productId, String name, double price){
        super(productId, name, price);
    }
    public double calculateTax(){
        return getPrice()*0.15;
    }
    public double calculateDiscount(){
        return getPrice()*0.1;
    }
    public String getTaxDetails(){
        return "Tax: 15%";
    }
}
class  Clothing extends Product implements Taxable{
    public Clothing(String productId, String name, double price){
        super(productId, name, price);
    }
    public double calculateTax(){
        return getPrice() * 0.05;
    }
    public double calculateDiscount(){
        return getPrice()*0.2;
    }
    public String getTaxDetails(){
        return "Tax: 5%";
    }
}
class Groceries extends Product {
    public Groceries(String productId, String name, double price) {
        super(productId, name, price);
    }

    public double calculateDiscount() {
        return getPrice() * 0.05;
    }
}
public class ECommercePlatform {
    public static void main(String[] args) {
        Product electronics = new Electronics("E001", "Smartphone", 1000);
        Product clothing = new Clothing("C001", "T-Shirt", 50);
        Product groceries = new Groceries("G001", "Apple", 1);
        electronics.displayDetails();
        System.out.println();
        clothing.displayDetails();
        System.out.println();
        groceries.displayDetails();
    }
}

