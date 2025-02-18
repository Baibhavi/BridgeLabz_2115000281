package Day18;
interface BookCategory {}
interface ClothingCategory {}
class Product<T>{
    private String name;
    private double price;
    private T category;
    public Product(String name, double price, T category){
        this.name = name;
        this.price = price;
        this.category = category;
    }
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    public T getCategory(){
        return category;
    }
    public void setPrice(double newPrice){
        this.price = newPrice;
    }
    public String toString() {
        return "Product: " + name + ", Price: " + price + ", Category: " + category.getClass().getSimpleName();
    }
}
class Book implements BookCategory{
    private String author;
    public Book(String author){
        this.author = author;
    }
    public String getAuthor(){
        return author;
    }
    public String toString() {
        return "Book by " + author;
    }
}
class Clothing implements ClothingCategory {
    private String size;
    public Clothing(String size) {
        this.size = size;
    }
    public String getSize() {
        return size;
    }
    public String toString() {
        return "Clothing size " + size;
    }
}
class Discount{
    public static <T> void applyDiscount(Product<T> product, double percent){
        double discount = product.getPrice() * percent / 100;
        product.setPrice(product.getPrice()-discount);
    }
}
public class DynamicOnlineMarketplace {
    public static void main(String[] args) {
        Product<Book> book = new Product<>("Godan", 45.00, new Book("Premchand"));
        Product<Clothing> shirt = new Product<>("T-Shirt", 25.00, new Clothing("M"));
        System.out.println("Before Discount:");
        System.out.println(book);
        System.out.println(shirt);
        Discount.applyDiscount(book, 10);
        Discount.applyDiscount(shirt, 15);
        System.out.println("After Discount:");
        System.out.println(book);
        System.out.println(shirt);
    }
}
