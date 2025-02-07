package Day11.SingleInheritance;
public class LibraryManagement {
    public static void main(String[] args) {
        Book book = new Book("Godaan", 1936);
        Author author = new Author("Gunahon Ka Devta", 1949, "Dharamvir Bharti", "The story is set in Allahabad during the British rule in India.");
        book.displayInfo();
        author.displayInfo();
    }
}
class Book {
    String title;
    int publicationYear;
    public Book(String title, int publicationYear){
        this.title = title;
        this.publicationYear = publicationYear;
    }
    public void displayInfo(){
        System.out.print("\nTitle: " + title + ", Publication Year: " + publicationYear);
    }
}
class Author extends Book{
    String name;
    String bio;
    public Author(String title, int publicationYear, String name, String bio){
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }
    public void displayInfo(){
        super.displayInfo();
        System.out.println(", Author Name: " + name + ", Bio: " + bio);
    }
}
