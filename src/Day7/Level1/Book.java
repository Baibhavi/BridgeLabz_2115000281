package Day7.Level1;

public class Book {
    private String title;
    private String author;
    private float price;
    public Book(String title, String author, float price){
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public void displayBookDetails(){
        System.out.println("Title : " + title);
        System.out.println("Author : " + author);
        System.out.println("Price : Rs. " + price);
    }

    public static void main(String[] args) {
        Book book = new Book("Godan", "Munshi Premchand", 200);
        book.displayBookDetails();
    }
}
