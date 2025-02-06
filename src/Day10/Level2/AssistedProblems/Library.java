package Day10.Level2.AssistedProblems;

import java.util.ArrayList;
class Library {
    ArrayList<Book> books;
    public Library(){
        books = new ArrayList<>();
    }
    public void addBook(Book book){
        books.add(book);
    }
    public void displayBooks(){
        for(Book book : books){
            System.out.println("Title : " + book.getTitle() + "  Author : " + book.getAuthor());
        }
    }
}
class Book {
    String title;
    String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}
class Main{
    public static void main(String[] args) {
        Book book1 = new Book("1984", "George Orwell");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee");
        Book book3 = new Book("The Great Gatsby", "F. Scott Fitzgerald");
        Library library1 = new Library();
        Library library2 = new Library();
        library1.addBook(book1);
        library1.addBook(book3);
        library2.addBook(book2);
        System.out.println("Library-1 Books ");
        library1.displayBooks();
        System.out.println("\nLibrary-2 Books ");
        library2.displayBooks();
    }
}