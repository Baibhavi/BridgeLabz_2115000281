package Day8.AccessModifier;

public class Book {
    public long ISBN;
    protected String title;
    private String author;
    public Book(){
        this.ISBN = 0;
        this.title = "Unknown";
        this.author = "Unknown";
    }
    public Book(long ISBN, String title, String author){
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public String getAuthor(){
        return author;
    }
    public static void main(String[] args) {
        EBook ebook = new EBook(9783161484100L, "Learn Java", "Jane Doe");
        ebook.display();
        ebook.setAuthor("John Smith");
        System.out.println("Updated Author: " + ebook.getAuthor());
    }
}
class EBook extends Book{
    public EBook(long ISBN, String title, String author) {
        super(ISBN, title, author);
    }

    public void display() {
        System.out.println("ISBN : " + super.ISBN);
        System.out.println("Title : " + super.title);
        System.out.println("Author : " + getAuthor());
    }
}
