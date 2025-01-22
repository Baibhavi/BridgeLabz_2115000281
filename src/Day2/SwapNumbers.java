package Day2;
import java.util.Scanner;
public class SwapNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        number2 = number1 + number2;
        number1 = number2 - number1;
        number2 = number2 - number1;
        System.out.println("The swapped numbers are  " + number1 + " and " + number2);
    }
}
