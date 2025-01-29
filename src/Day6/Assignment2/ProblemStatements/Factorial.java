package Day6.Assignment2.ProblemStatements;
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        int number = takeInput();
        long factorial = calculateFactorial(number);
        displayOutput(number, factorial);
    }
    public static int takeInput() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to calculate its factorial: ");
        int number = input.nextInt();
        input.close();
        return number;
    }
    public static long calculateFactorial(int number) {
        if (number <= 1) {
            return 1;
        } else {
            return number * calculateFactorial(number - 1);
        }
    }
    public static void displayOutput(int number, long factorial) {
        System.out.println("The factorial of " + number + " is " + factorial);
    }
}
