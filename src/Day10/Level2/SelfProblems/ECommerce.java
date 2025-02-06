package Day10.Level2.SelfProblems;
import java.util.ArrayList;
import java.util.List;
public class ECommerce {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Baibhavi");
        Customer customer2 = new Customer("Pooja");
        Product product1 = new Product("Laptop", 100000.0);
        Product product2 = new Product("Smartphone", 50000.0);
        Order order1 = new Order(customer1);
        order1.addProduct(product1);
        order1.addProduct(product2);
        Order order2 = new Order(customer2);
        order2.addProduct(product2);
        customer1.placeOrder(order1);
        customer2.placeOrder(order2);
        System.out.println("Orders for " + customer1.getName());
        for (Order order : customer1.getOrders()) {
            for (Product product : order.getProducts()) {
                System.out.println("  Product: " + product.getName() + ", Price: " + product.getPrice());
            }
        }
        System.out.println("Orders for " + customer2.getName());
        for (Order order : customer2.getOrders()) {
            for (Product product : order.getProducts()) {
                System.out.println("  Product: " + product.getName() + ", Price: " + product.getPrice());
            }
        }
    }
}
class Product {
    private String name;
    private double price;
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
}
class Order {
    private Customer customer;
    private List<Product> products;
    public Order(Customer customer) {
        this.customer = customer;
        this.products = new ArrayList<>();
    }
    public void addProduct(Product product) {
        products.add(product);
    }
    public Customer getCustomer() {
        return customer;
    }
    public List<Product> getProducts() {
        return products;
    }
}
class Customer {
    private String name;
    private List<Order> orders;
    public Customer(String name) {
        this.name = name;
        this.orders = new ArrayList<>();
    }
    public String getName() {
        return name;
    }
    public void placeOrder(Order order) {
        orders.add(order);
    }
    public List<Order> getOrders() {
        return orders;
    }
}