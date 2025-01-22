package Day2;
import java.util.Scanner;
public class PoundsToKilo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double pound = input.nextDouble();
        double kilograms = pound * 2.2;
        System.out.println("The weight of the person in pound is " + pound + " and in kg is " + kilograms);
    }
}
