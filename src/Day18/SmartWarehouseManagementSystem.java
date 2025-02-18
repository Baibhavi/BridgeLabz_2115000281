package Day18;

import java.util.ArrayList;
import java.util.List;
abstract class WarehouseItem{
    private String name;
    private double price;
    public  WarehouseItem(String name, double price){
        this.name = name;
        this.price = price;
    }
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    @Override
    public String toString(){
        return "Item: " + name + ", Price: " + price;
    }
}
class Electronics extends WarehouseItem{
    private String brand;
    public Electronics(String name, double price, String brand){
        super(name, price);
        this.brand = brand;
    }
    public String getBrand(){
        return brand;
    }
    @Override
    public String toString(){
        return super.toString() + ", Brand: " + brand;
    }
}
class Groceries extends WarehouseItem {
    private String expirationDate;
    public Groceries(String name, double price, String expirationDate) {
        super(name, price);
        this.expirationDate = expirationDate;
    }
    public String getExpirationDate() {
        return expirationDate;
    }
    @Override
    public String toString() {
        return super.toString() + ", Expiration Date: " + expirationDate;
    }
}
class Furniture extends WarehouseItem {
    private String material;
    public Furniture(String name, double price, String material) {
        super(name, price);
        this.material = material;
    }
    public String getMaterial() {
        return material;
    }
    @Override
    public String toString() {
        return super.toString() + ", Material: " + material;
    }
}
class Storage<T extends WarehouseItem>{
    private List<T> items;
    public Storage(){
        items = new ArrayList<>();
    }
    public void addItem(T item){
        items.add(item);
    }
    public void removeItem(T item){
        items.remove(item);
    }
    public T getItem(int index){
        return items.get(index);
    }
    public List<T> getAllItems(){
        return items;
    }
    public void displayItems(List<? extends WarehouseItem> items){
        for (WarehouseItem item: items) {
            System.out.println(item);
        }
    }
}
public class SmartWarehouseManagementSystem {
    public static void main(String[] args) {
        Storage<Electronics> electronicsStorage = new Storage<>();
        Storage<Groceries> groceriesStorage = new Storage<>();
        Storage<Furniture> furnitureStorage = new Storage<>();
        Electronics laptop = new Electronics("Laptop", 1500.00, "BrandX");
        Groceries apple = new Groceries("Apple", 0.50, "2025-12-31");
        Furniture chair = new Furniture("Chair", 75.00, "Wood");
        electronicsStorage.addItem(laptop);
        groceriesStorage.addItem(apple);
        furnitureStorage.addItem(chair);
        System.out.println("Electronics Storage:");
        electronicsStorage.displayItems(electronicsStorage.getAllItems());
        System.out.println("Groceries Storage:");
        groceriesStorage.displayItems(groceriesStorage.getAllItems());
        System.out.println("Furnitures Storage:");
        furnitureStorage.displayItems(furnitureStorage.getAllItems());
    }
}
