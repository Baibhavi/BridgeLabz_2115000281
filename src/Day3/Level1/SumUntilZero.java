package Day3.Level1;
import java.util.Scanner;
public class SumUntilZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double total = 0.0;
        double number;
        do{
            System.out.println("Enter a number (0 to stop) : ");
            number = input.nextDouble();
            total += number;
        }
        while(number!=0);
        System.out.println("The total sum is " + total);
    }
}
