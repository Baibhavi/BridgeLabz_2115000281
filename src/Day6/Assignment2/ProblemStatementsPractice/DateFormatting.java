package Day6.Assignment2.ProblemStatementsPractice;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class DateFormatting {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter format3 = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");
        String date1 = currentDate.format(format1);
        String date2 = currentDate.format(format2);
        String date3 = currentDate.format(format3);
        System.out.println("Current date in dd/MM/yyyy format: " + date1);
        System.out.println("Current date in yyyy-MM-dd format: " + date2);
        System.out.println("Current date in EEE, MMM dd, yyyy format: " + date3);
    }
}

