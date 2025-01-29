package Day6.Assignment2.ProblemStatementsPractice;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class DateArithmatic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.print("Enter a date (yyyy-MM-dd): ");
        String dateString = input.nextLine();
        LocalDate date = LocalDate.parse(dateString, formatter);
        LocalDate newDate = date.plusDays(7).plusMonths(1).plusYears(2).minusWeeks(3);
        System.out.println("Original date: " + date.format(formatter));
        System.out.println("New date after adding 7 days, 1 month, 2 years and subtracting 3 weeks: " + newDate.format(formatter));
        input.close();
    }
}
