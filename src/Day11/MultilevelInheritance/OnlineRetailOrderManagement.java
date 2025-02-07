package Day11.MultilevelInheritance;
class Order{
    private String orderID;
    private String orderDate;
    public Order(String orderID, String orderDate){
        this.orderID = orderID;
        this.orderDate = orderDate;
    }
    public String getOrderStatus(){
        return "Order Placed\n";
    }
    public void displayDetails(){
        System.out.println("Order ID: " + orderID + "\nOrder Date: " + orderDate);
    }
}
class ShippedOrder extends Order{
    private long trackingNumber;
    public ShippedOrder(String orderID, String orderDate, long trackingNumber){
        super(orderID, orderDate);
        this.trackingNumber = trackingNumber;
    }
    public String getOrderStatus(){
        return "Order Shipped\n";
    }
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Tracking Number: " + trackingNumber);
    }
}
class DeliveredOrder extends ShippedOrder {
    private String deliveryDate;

    public DeliveredOrder(String orderID, String orderDate, long trackingNumber, String deliveryDate) {
        super(orderID, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    public String getOrderStatus() {
        return "Order Delivered\n";
    }
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Delivery Date: " + deliveryDate);
    }
}
public class OnlineRetailOrderManagement {
    public static void main(String[] args) {
        Order order = new Order("2234", "07-02-25");
        order.displayDetails();
        System.out.println("Order Status: " + order.getOrderStatus());
        ShippedOrder shippedOrder = new ShippedOrder("7553", "24-01-24", 972484);
        shippedOrder.displayDetails();
        System.out.println("Order Status: " + shippedOrder.getOrderStatus());
        DeliveredOrder deliveredOrder = new DeliveredOrder("12345", "2025-02-07", 67890875, "2025-02-10");
        deliveredOrder.displayDetails();
        System.out.println("Order Status: " + deliveredOrder.getOrderStatus());
    }
}
