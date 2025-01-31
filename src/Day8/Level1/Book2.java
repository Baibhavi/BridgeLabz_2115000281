package Day8.Level1;

public class Book2 {
    private String title;
    private String author;
    private double price;
    private int availability;
    public Book2(){
        this.title = "Unknown Title";
        this.author = "Unknown Author";
        this.price = 0.0;
        this.availability = 0;
    }
    public Book2(String title, String author, double price, int availability){
        this.title = title;
        this.author = author;
        this.price = price;
        this.availability = availability;
    }

    public static void main(String[] args) {
        Book2 book1 = new Book2("Godan", "Premchand", 245.50, 4);
        System.out.println(book1);
        if (book1.canBorrowed()) {
            System.out.println("Book borrowed successfully.");
        } else {
            System.out.println("Book not available.");
        }

        System.out.println(book1);
    }
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", Price: " + price + ", Availability: " + availability;
    }
    public boolean canBorrowed(){
        if(availability > 0){
            availability--;
            return true;
        }
        return false;
    }
}
