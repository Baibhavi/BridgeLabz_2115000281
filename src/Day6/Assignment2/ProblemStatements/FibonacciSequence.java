package Day6.Assignment2.ProblemStatements;
import java.util.Scanner;
public class FibonacciSequence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = input.nextInt();
        input.close();
        generateFibonacci(n);
    }
    public static void generateFibonacci(int n){
        if(n <= 0){
            System.out.println("Enter positive number");
            return;
        }
        int first = 0, second = 1;
        System.out.print("Fibonacci Sequence : " + first + " " + second + " ");
        for(int i = 3; i <= n; i++){
            int next = first + second;
            System.out.print(next + " ");
            first = second;
            second = next;
        }
        System.out.println();
    }
}
