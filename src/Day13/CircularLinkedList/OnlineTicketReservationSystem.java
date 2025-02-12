package Day13.CircularLinkedList;
class Ticket {
    int ticketId;
    String customerName;
    String movieName;
    int seatNumber;
    String bookingTime;
    Ticket next;

    public Ticket(int ticketId, String customerName, String movieName, int seatNumber, String bookingTime) {
        this.ticketId = ticketId;
        this.customerName = customerName;
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.bookingTime = bookingTime;
        this.next = null;
    }
}
class TicketReservation{
    Ticket head, tail;
    public TicketReservation(){
        this.head = null;
        this.tail = null;
    }
    public void addTicket(int ticketId, String customerName, String movieName, int seatNumber, String bookingTime){
        Ticket newTicket = new Ticket(ticketId, customerName, movieName, seatNumber, bookingTime);
        if(head == null){
            head = tail = newTicket;
        }
        else{
            tail.next = newTicket;
            tail = newTicket;
            tail.next = head;
        }
    }
    public void removeTicket(int ticketId){
        if(head == null){
            System.out.println("Empty List");
            return;
        }
        if(head.ticketId == ticketId){
            if(head == tail){
                head= tail = null;
            }
            else{
                head = head.next;
                tail.next = head;
            }
        }
        Ticket temp = head, prev = null;
        do{
            if(temp.ticketId == ticketId){
                prev.next = temp.next;
                if(temp == tail){
                    tail = prev;
                }
                return;
            }
            prev = temp;
            temp = temp.next;
        }while(temp != head);
        System.out.println("Ticket ID not found");
    }
    public void displayTickets() {
        if (head == null) {
            System.out.println("No tickets to display.");
            return;
        }
        Ticket temp = head;
        do {
            System.out.println("Ticket ID: " + temp.ticketId + ", Customer: " + temp.customerName +
                    ", Movie: " + temp.movieName + ", Seat: " + temp.seatNumber +
                    ", Booking Time: " + temp.bookingTime);
            temp = temp.next;
        } while (temp != head);
    }
    public void searchTicket(String search){
        if (head == null) {
            System.out.println("No tickets to search.");
            return;
        }
        Ticket temp = head;
        do{
            if(temp.customerName.equals(search) || temp.movieName.equals(search)){
                System.out.println("Ticket ID: " + temp.ticketId + ", Customer: " + temp.customerName +
                        ", Movie: " + temp.movieName + ", Seat: " + temp.seatNumber +
                        ", Booking Time: " + temp.bookingTime);
                return;
            }
            temp = temp.next;
        }while(temp != head);
        System.out.println("No tickets found for search query: " + search);
    }
    public int bookedTicketCount(){
        if(head == null){
            return 0;
        }
        int count = 0;
        Ticket temp = head;
        do{
            count++;
            temp = temp.next;
        }while(temp != head);
        return count;
    }
}
public class OnlineTicketReservationSystem {
    public static void main(String[] args) {
        TicketReservation reservation = new TicketReservation();
        reservation.addTicket(1, "Baibhavi", "Avengers", 101, "2025-02-12 18:00");
        reservation.addTicket(2, "Pooja", "Star Wars", 102, "2025-02-12 18:30");
        reservation.addTicket(3, "Divya", "Inception", 103, "2025-02-12 19:00");
        reservation.displayTickets();
        reservation.removeTicket(2);
        reservation.displayTickets();
        reservation.searchTicket("Baibhavi");
        reservation.searchTicket("Star Wars");
        int totalTickets = reservation.bookedTicketCount();
        System.out.println("Total booked tickets: " + totalTickets);
    }
}
