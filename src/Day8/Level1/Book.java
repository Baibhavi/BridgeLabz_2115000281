package Day8.Level1;

public class Book {
    private String title;
    private String author;
    private double price;
    public Book(){
        this.title = "Unknown Title";
        this.author = "Unknown Author";
        this.price = 0.0;
    }
    public Book(String title, String author, double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public static void main(String[] args) {
        Book book1 = new Book();
        book1.setTitle("Godan");
        book1.setAuthor("Premchand");
        book1.setPrice(245.50);
        System.out.println(book1.getTitle());
        System.out.println(book1.getAuthor());
        System.out.println(book1.getPrice());
        Book book2 = new Book();
        System.out.println(book2.getTitle());
        System.out.println(book2.getAuthor());
        System.out.println(book2.getPrice());
    }
    public void setTitle(String title){
        this.title = title;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public double getPrice(){
        return price;
    }
}
