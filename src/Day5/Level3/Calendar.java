package Day5.Level3;
import java.util.Scanner;
public class Calendar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the month (1-12):");
        int month = input.nextInt();
        System.out.println("Enter the year:");
        int year = input.nextInt();

        printCalendar(month, year);
    }

    public static void printCalendar(int month, int year) {
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (isLeapYear(year)) {
            days[1] = 29;
        }

        System.out.println("  " + months[month - 1] + " " + year);
        System.out.println("Su Mo Tu We Th Fr Sa");

        int startDay = getStartDay(month, year);
        for (int i = 0; i < startDay; i++) {
            System.out.print("   ");
        }

        for (int i = 1; i <= days[month - 1]; i++) {
            System.out.printf("%2d ", i);
            if ((i + startDay) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

    public static boolean isLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else if (year % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static int getStartDay(int month, int year) {
        int y = year - (14 - month) / 12;
        int x = y + y / 4 - y / 100 + y / 400;
        int m = month + 12 * ((14 - month) / 12) - 2;
        int d = (1 + x + (31 * m) / 12) % 7;
        return d;
    }
}
