package Day3.Level1;
import java.util.Scanner;
public class Factorial2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if(number <= 0){
            System.out.println("Not a natural number");
        }
        else{
            int factorial = 1;
            for(int i = number; i > 0; i--){
                factorial *= i;
            }
            System.out.println("Factorial of "+ number + " is "+ factorial);
        }
        input.close();
    }
}
