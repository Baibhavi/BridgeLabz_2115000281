package Day5.Level1;
import java.util.Scanner;
public class NumOfRounds {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the sides of the triangular park in meters:");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();

        double result = numOfRounds(side1, side2, side3);
        System.out.println("Number of rounds = " + result);
        input.close();
    }
    public static double numOfRounds(double side1, double side2, double side3) {
        double perimeter = (side1 + side2 + side3) / 1000;
        double rounds = perimeter / 5;
        return rounds;
    }
}
