package Day13.SinglyLinkedList;
class Item{
    int id;
    String name;
    int quantity;
    double price;
    Item next;
    public Item(int id, String name, int quantity, double price){
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.next = null;
    }
}
class ProductRecord{
    Item head;
    public ProductRecord(){
        this.head = null;
    }
    public void addAtBeginning(int id, String name, int quantity, double price){
        Item newItem = new Item( id,  name,  quantity,  price);
        newItem.next = head;
        head = newItem;
    }
    public void addAtEnd(int id, String name, int quantity, double price){
        Item newItem = new Item( id,  name,  quantity,  price);
        if(head == null){
            head = newItem;
        }
        else{
            Item temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newItem;
        }
    }
    public void addAtPosition(int position, int id, String name, int quantity, double price){
        if(position < 1){
            System.out.println("Invalid position");
            return;
        }
        if (position == 1) {
            addAtBeginning( id, name, quantity, price);
            return;
        }
        Item newItem = new Item( id,  name,  quantity,  price);
        Item temp = head;
        for(int i = 1; i < position-1 && temp != null; i++ ){
            temp = temp.next;
        }
        if(temp == null){
            System.out.println("Position out of range");
            return;
        }
        newItem.next = temp.next;
        temp.next = newItem;
    }
    public void removeItem(int id){
        if(head == null){
            System.out.println("Empty LinkedList");
            return;
        }
        if(head.id == id){
            head = head.next;
            return;
        }
        Item temp = head;
        Item prev = null;
        while(temp != null && temp.id != id){
            prev = temp;
            temp = temp.next;
        }
        if(temp == null){
            System.out.println("Item not found");
            return;
        }
        prev.next = temp.next;
    }
    public void displayRecords(){
        Item temp = head;
        if(head != null){
            while(temp != null){
                System.out.println("Item Name: " + temp.name + ", Item Id: " + temp.id + ", Quantity: " + temp.quantity + ", Price: " + temp.price );
                temp = temp.next;
            }
            System.out.println();
        }
        else{
            System.out.println("Empty LinkedList");
        }
    }
    public void updateQuantity(int id, int newQauntity){
        if(head == null){
            System.out.println("Empty List");
            return;
        }
        Item temp = head;
        while(temp != null){
            if(temp.id == id){
                temp.quantity = newQauntity;
                return;
            }
            temp = temp.next;
        }
        if(temp == null){
            System.out.println("Item not found");
        }
    }
    public void searchItem(int id){
        Item temp = head;
        while(temp != null){
            if(temp.id == id){
                System.out.println("Item Name: " + temp.name + ", Item Id: " + temp.id + ", Quantity: " + temp.quantity + ", Price: " + temp.price );
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item not found!");
    }
    public void searchItem(String name){
        Item temp = head;
        while(temp != null){
            if(temp.name == name){
                System.out.println("Item Name: " + temp.name + ", Item Id: " + temp.id + ", Quantity: " + temp.quantity + ", Price: " + temp.price +"\n");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item not found!");
    }
    public double totalPrice(){
        Item temp = head;
        double total = 0;
        while(temp != null){
            System.out.println("Item Name: " + temp.name + ", Total Cost: " + temp.quantity*temp.price);
            total += temp.quantity*temp.price;
            temp = temp.next;
        }
        System.out.println();
        return total;
    }

    public void sortInventoryByName(){
        if(head == null || head.next == null){
            System.out.println("Empty LinkedList or single item");
            return;
        }
        boolean swapped;
        do{
            swapped = false;
            Item current = head;
            Item prev = null;
            while(current != null && current.next != null){
                if(current.name.compareTo(current.next.name) > 0){
                    if(prev != null){
                        Item temp = current.next;
                        current.next = current.next.next;
                        temp.next = current;
                        prev.next = temp;
                    }
                    else{
                        Item tmp = current.next;
                        current.next = current.next.next;
                        tmp.next = current;
                        head = tmp;
                    }
                    swapped = true;
                }
                prev = current;
                current = current.next;
            }
        }while(swapped);
    }

}
public class InventoryManagementSystem {
    public static void main(String[] args) {
        ProductRecord product = new ProductRecord();
        product.addAtBeginning(101, "Soap", 10, 50);
        product.addAtEnd(102, "Shampoo", 20, 120);
        product.addAtPosition(2, 103, "Facewash", 6, 90);
        product.addAtEnd(104, "Conditioner", 15, 170);
        product.displayRecords();
        product.removeItem(103);
        product.displayRecords();
        product.updateQuantity(101, 25);
        product.displayRecords();
        product.searchItem(103);
        product.searchItem("Shampoo");
        System.out.println("Total Inventory Cost: " + product.totalPrice());
        product.sortInventoryByName();
        product.displayRecords();
    }
}
