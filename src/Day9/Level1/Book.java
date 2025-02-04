package Day9.Level1;

public class Book {
    private static String libraryName = "Central Library";
    private String title, author;
    private final long isbn;
    public Book(String title, String author, long isbn){
        this.author = author;
        this.title = title;
        this.isbn = isbn;
    }
    public static void displayLibraryName(){
        System.out.println(libraryName);
    }
    public void displayBookDetails(){
        if( this instanceof Book){
            System.out.println("Book Name : " + this.title);
            System.out.println("Author Name : " + this.author);
            System.out.println("ISBN Number : " + this.isbn);
            System.out.print("\n-----------------------------------------------------------------------------------------------\n");
        }
        else{
            System.out.println("Invalid Request");
        }
    }

    public static void main(String[] args) {
        Book book1 = new Book("Gunahon Ka Devta", "Dharamvir Bharti", 5321234);
        Book book2 = new Book("Godan", "Premchand", 7358821);
        displayLibraryName();
        book1.displayBookDetails();
        book2.displayBookDetails();

    }
}
