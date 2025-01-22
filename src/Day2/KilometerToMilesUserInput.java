package Day2;
import java.util.Scanner;
public class KilometerToMilesUserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double km = input.nextInt();
        double mile = km/1.6;
        System.out.println("The total miles is "+ mile+" mile for the given "+  km +" km");
    }
}
