package Day6.Assignment2.ProblemStatements;
import java.util.Scanner;
public class GCDAndLCMCalculator {
    public static void main(String[] args) {
        int[] numbers = takeInput();
        int gcd = calculateGCD(numbers[0], numbers[1]);
        int lcm = calculateLCM(numbers[0], numbers[1], gcd);
        displayOutput(numbers[0], numbers[1], gcd, lcm);
    }
    public static int[] takeInput() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();
        input.close();
        return new int[]{num1, num2};
    }
    public static int calculateGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static int calculateLCM(int a, int b, int gcd) {
        return (a * b) / gcd;
    }
    public static void displayOutput(int num1, int num2, int gcd, int lcm) {
        System.out.println("The GCD of " + num1 + " and " + num2 + " is " + gcd);
        System.out.println("The LCM of " + num1 + " and " + num2 + " is " + lcm);
    }
}

