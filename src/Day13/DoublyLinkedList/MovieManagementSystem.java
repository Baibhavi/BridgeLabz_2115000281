package Day13.DoublyLinkedList;
class Movie{
    String title, director;
    int year;
    double rating;
    Movie next, prev;
    public Movie(String title, String director, int yearOfRelease, double rating){
        this.title = title;
        this.director = director;
        this.year = yearOfRelease;
        this.rating = rating;
        this.next = null;
        this.prev = null;
    }
}
class MovieRecord{
    Movie head, tail;
    public MovieRecord(){
        this.head = null;
        this.tail = null;
    }
    public void addAtBeginning(String title, String director, int year, double rating){
        Movie newMovie = new Movie(title, director, year, rating);
        if(head == null){
            head = tail = newMovie;
        }
        else{
            newMovie.next = head;
            head.prev = newMovie;
            head = newMovie;
        }
    }
    public void addAtEnd(String title, String director, int year, double rating){
        Movie newMovie = new Movie(title, director, year, rating);
        if(head == null){
            head = tail = newMovie;
        }
        else{
            newMovie.prev = tail;
            tail.next = newMovie;
            tail = newMovie;
        }
    }
    public void addAtPosition(int position, String title, String director, int year, double rating) {
        if (position < 1) {
            System.out.println("Invalid position");
            return;
        }
        if (position == 1) {
            addAtBeginning(title, director, year, rating);
            return;
        }
        Movie newMovie = new Movie(title, director, year, rating);
        Movie temp = head;
        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Position out of range");
            return;
        }
        newMovie.next = temp.next;
        newMovie.prev = temp;
        if (temp.next != null) {
            temp.next.prev = newMovie;
        } else {
            tail = newMovie;
        }
        temp.next = newMovie;
    }
    public void removeMovie(String title) {
        Movie temp = head;
        while (temp != null && !temp.title.equals(title)) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Movie not found");
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
    public void searchMovieByDirector(String director) {
        Movie temp = head;
        while (temp != null) {
            if (temp.director.equals(director)) {
                System.out.println("Movie Title: " + temp.title + ", Director: " + temp.director + ", Year: " + temp.year + ", Rating: " + temp.rating);
            }
            temp = temp.next;
        }
    }

    public void searchMovieByRating(double rating) {
        Movie temp = head;
        while (temp != null) {
            if (temp.rating == rating) {
                System.out.println("Movie Title: " + temp.title + ", Director: " + temp.director + ", Year: " + temp.year + ", Rating: " + temp.rating);
            }
            temp = temp.next;
        }
    }
    public void displayRecords() {
        Movie temp = head;
        while (temp != null) {
            System.out.println("Movie Title: " + temp.title + ", Director: " + temp.director + ", Year: " + temp.year + ", Rating: " + temp.rating);
            temp = temp.next;
        }
    }
    public void displayRecordsInReverse() {
        Movie temp = tail;
        while (temp != null) {
            System.out.println("Movie Title: " + temp.title + ", Director: " + temp.director + ", Year: " + temp.year + ", Rating: " + temp.rating);
            temp = temp.prev;
        }
    }
    public void updateRating(String title, double newRating) {
        Movie temp = head;
        while (temp != null) {
            if (temp.title.equals(title)) {
                temp.rating = newRating;
                return;
            }
            temp = temp.next;
        }
        System.out.println("Movie not found");
    }
}
public class MovieManagementSystem {
    public static void main(String[] args) {
        MovieRecord movieSystem = new MovieRecord();
        movieSystem.addAtBeginning("Inception", "Christopher Nolan", 2010, 8.8);
        movieSystem.addAtEnd("The Shawshank Redemption", "Frank Darabont", 1994, 9.3);
        movieSystem.addAtPosition(2, "The Dark Knight", "Christopher Nolan", 2008, 9.0);
        movieSystem.displayRecords();
        movieSystem.displayRecordsInReverse();
        movieSystem.searchMovieByDirector("Christopher Nolan");
        movieSystem.searchMovieByRating(9.3);
        movieSystem.updateRating("Inception", 9.0);
        movieSystem.displayRecords();
        movieSystem.removeMovie("The Dark Knight");
        movieSystem.displayRecords();
    }
}
