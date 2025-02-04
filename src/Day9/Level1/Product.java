package Day9.Level1;
public class Product {
    private static double discount = 0.0;
    private String productName;
    private final int productId;
    private double price;
    private int quantity;
    public Product(String productName, int productId, double price, int quantity){
        this.productName = productName;
        this.productId = productId;
        this.price = price;
        this.quantity = quantity;
    }
    public static void updateDiscount(double newDiscount){
        discount = newDiscount;
    }
    public void displayProductDetails(){
        if(this instanceof Product){
            System.out.println("Product : " + this.productName);
            System.out.println("ProductID : " + this.productId);
            System.out.println("Price : $" + this.price);
            System.out.println("Quantity : " + this.quantity);
            System.out.println("Discount : " + discount + "%");
            System.out.print("\n-----------------------------------------------------------------------------------------------\n");
        }
        else{
            System.out.println("Invalid Request");
        }
    }

    public static void main(String[] args) {
        Product product1 = new Product("Chair", 213, 2000, 4);
        updateDiscount(10);
        product1.displayProductDetails();
        Product product2 = new Product("Table", 214, 1000, 2);
        updateDiscount(6);
        product2.displayProductDetails();
        Product product3 = new Product("Laptop", 455, 45000, 10);
        updateDiscount(15);
        product2.displayProductDetails();
    }
}
