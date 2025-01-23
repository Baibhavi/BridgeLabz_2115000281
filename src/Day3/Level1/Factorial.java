package Day3.Level1;
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int temp = number;
        int factorial = 1;
        while(temp > 0){
            factorial *= temp;
            temp--;
        }
        System.out.println("Factorial of " + number + " is " + factorial);
    }
}
