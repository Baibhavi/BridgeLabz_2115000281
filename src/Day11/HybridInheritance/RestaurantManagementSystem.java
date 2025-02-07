package Day11.HybridInheritance;
class Person{
    String name;
    String id;
    public Person(String name, String id){
        this.name = name;
        this.id = id;
    }
    public void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}
class Chef extends Person implements Worker{
    public Chef(String name, String id){
        super(name, id);
    }
    public void performDuties(){
        System.out.println("Preparing meals and managing the kitchen");
    }
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Role: Chef");
    }
}
class Waiter extends Person implements Worker{
    public Waiter(String name, String id){
        super(name, id);
    }
    public void performDuties(){
        System.out.println("Serving customers and managing orders.");
    }
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Role: Waiter");
    }
}
interface Worker{
    void performDuties();
}
public class RestaurantManagementSystem {
    public static void main(String[] args) {
        Chef chef = new Chef("Aman Singh", "101");
        Waiter waiter = new Waiter("Baibhavi", "102");
        chef.displayInfo();
        chef.performDuties();
        System.out.println();
        waiter.displayInfo();
        waiter.performDuties();
    }
}
