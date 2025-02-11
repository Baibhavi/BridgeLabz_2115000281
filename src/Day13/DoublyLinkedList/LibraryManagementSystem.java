package Day13.DoublyLinkedList;
class Book {
    String title;
    String author;
    String genre;
    int bookId;
    boolean isAvailable;
    Book next;
    Book prev;
    public Book(String title, String author, String genre, int bookId, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.bookId = bookId;
        this.isAvailable = isAvailable;
        this.next = null;
        this.prev = null;
    }
}
class LibraryManagement {
    Book head;
    Book tail;
    public LibraryManagement() {
        this.head = null;
        this.tail = null;
    }
    public void addAtBeginning(String title, String author, String genre, int bookId, boolean isAvailable) {
        Book newBook = new Book(title, author, genre, bookId, isAvailable);
        if (head == null) {
            head = tail = newBook;
        } else {
            newBook.next = head;
            head.prev = newBook;
            head = newBook;
        }
    }
    public void addAtEnd(String title, String author, String genre, int bookId, boolean isAvailable) {
        Book newBook = new Book(title, author, genre, bookId, isAvailable);
        if (tail == null) {
            head = tail = newBook;
        } else {
            newBook.prev = tail;
            tail.next = newBook;
            tail = newBook;
        }
    }
    public void addAtPosition(int position, String title, String author, String genre, int bookId, boolean isAvailable) {
        if (position < 1) {
            System.out.println("Invalid position");
            return;
        }
        if (position == 1) {
            addAtBeginning(title, author, genre, bookId, isAvailable);
            return;
        }
        Book newBook = new Book(title, author, genre, bookId, isAvailable);
        Book temp = head;
        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Position out of range");
            return;
        }
        newBook.next = temp.next;
        newBook.prev = temp;
        if (temp.next != null) {
            temp.next.prev = newBook;
        } else {
            tail = newBook;
        }
        temp.next = newBook;
    }
    public void removeBook(int bookId) {
        Book temp = head;
        while (temp != null && temp.bookId != bookId) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Book not found");
            return;
        }
        if (temp.prev != null) {
            temp.prev.next = temp.next;
        } else {
            head = temp.next;
        }
        if (temp.next != null) {
            temp.next.prev = temp.prev;
        } else {
            tail = temp.prev;
        }
    }
    public void searchBookByTitle(String title) {
        Book temp = head;
        while (temp != null) {
            if (temp.title.equals(title)) {
                System.out.println("Book Title: " + temp.title + ", Author: " + temp.author + ", Genre: " + temp.genre + ", Book ID: " + temp.bookId + ", Availability: " + temp.isAvailable);
            }
            temp = temp.next;
        }
    }
    public void searchBookByAuthor(String author) {
        Book temp = head;
        while (temp != null) {
            if (temp.author.equals(author)) {
                System.out.println("Book Title: " + temp.title + ", Author: " + temp.author + ", Genre: " + temp.genre + ", Book ID: " + temp.bookId + ", Availability: " + temp.isAvailable);
            }
            temp = temp.next;
        }
    }
    public void updateAvailability(int bookId, boolean newStatus) {
        Book temp = head;
        while (temp != null) {
            if (temp.bookId == bookId) {
                temp.isAvailable = newStatus;
                return;
            }
            temp = temp.next;
        }
        System.out.println("Book not found");
    }
    public void displayBooks() {
        Book temp = head;
        while (temp != null) {
            System.out.println("Book Title: " + temp.title + ", Author: " + temp.author + ", Genre: " + temp.genre + ", Book ID: " + temp.bookId + ", Availability: " + temp.isAvailable);
            temp = temp.next;
        }
    }
    public void displayBooksInReverse() {
        Book temp = tail;
        while (temp != null) {
            System.out.println("Book Title: " + temp.title + ", Author: " + temp.author + ", Genre: " + temp.genre + ", Book ID: " + temp.bookId + ", Availability: " + temp.isAvailable);
            temp = temp.prev;
        }
    }
    public int countBooks() {
        Book temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
}
public class LibraryManagementSystem {
    public static void main(String[] args) {
        LibraryManagement library = new LibraryManagement();
        library.addAtBeginning("1984", "George Orwell", "Dystopian", 1, true);
        library.addAtEnd("To Kill a Mockingbird", "Harper Lee", "Classic", 2, true);
        library.addAtPosition(2, "The Great Gatsby", "F. Scott Fitzgerald", "Classic", 3, false);
        library.displayBooks();
        library.displayBooksInReverse();
        library.searchBookByTitle("1984");
        library.searchBookByAuthor("Harper Lee");
        library.updateAvailability(1, false);
        library.displayBooks();
        library.removeBook(3);
        library.displayBooks();
        System.out.println("Total number of books: " + library.countBooks());
    }
}
