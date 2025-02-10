package Day12;
abstract class LibraryItem {
    private String itemId;
    private String title;
    private String author;
    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }
    public String getItemId() {
        return itemId;
    }
    public void setItemId(String itemId) {
        this.itemId = itemId;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public abstract int getLoanDuration();
    public void getItemDetails() {
        System.out.println("Item ID: " + itemId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}
interface Reservable {
    void reserveItem();
    boolean checkAvailability();
}
class Book extends LibraryItem implements Reservable {
    private boolean isReserved;
    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
        this.isReserved = false;
    }
    public int getLoanDuration() {
        return 21;
    }
    public void reserveItem() {
        if (!isReserved) {
            isReserved = true;
            System.out.println("Book reserved successfully.");
        } else {
            System.out.println("Book is already reserved.");
        }
    }
    public boolean checkAvailability() {
        return !isReserved;
    }
}
class Magazine extends LibraryItem implements Reservable {
    private boolean isReserved;
    public Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
        this.isReserved = false;
    }
    public int getLoanDuration() {
        return 7;
    }
    public void reserveItem() {
        if (!isReserved) {
            isReserved = true;
            System.out.println("Magazine reserved successfully.");
        } else {
            System.out.println("Magazine is already reserved.");
        }
    }
    public boolean checkAvailability() {
        return !isReserved;
    }
}
class DVD extends LibraryItem implements Reservable {
    private boolean isReserved;
    public DVD(String itemId, String title, String author) {
        super(itemId, title, author);
        this.isReserved = false;
    }
    public int getLoanDuration() {
        return 14;
    }
    public void reserveItem() {
        if (!isReserved) {
            isReserved = true;
            System.out.println("DVD reserved successfully.");
        } else {
            System.out.println("DVD is already reserved.");
        }
    }
    public boolean checkAvailability() {
        return !isReserved;
    }
}
public class LibraryManagementSystem {
    public static void main(String[] args) {
        LibraryItem book = new Book("B001", "The Great Gatsby", "F. Scott Fitzgerald");
        LibraryItem magazine = new Magazine("M001", "National Geographic", "Multiple Authors");
        LibraryItem dvd = new DVD("D001", "Inception", "Christopher Nolan");
        LibraryItem[] items = {book, magazine, dvd};
        for (LibraryItem item : items) {
            item.getItemDetails();
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");
            if (item instanceof Reservable) {
                Reservable reservable = (Reservable) item;
                reservable.reserveItem();
                System.out.println("Availability: " + reservable.checkAvailability());
            }
            System.out.println();
        }
    }
}

