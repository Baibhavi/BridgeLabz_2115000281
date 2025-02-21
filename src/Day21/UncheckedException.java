package Day21;

import java.util.InputMismatchException;
import java.util.Scanner;
public class UncheckedException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try{
            System.out.print("Enter the numerator: ");
            int numerator = input.nextInt();
            System.out.print("Enter the denominator: ");
            int denominator = input.nextInt();
            int result = numerator/denominator;
            System.out.println("Result = " + result);
        }
        catch (ArithmeticException e){
            System.out.println(e);
        }
        catch (InputMismatchException e){
            System.out.println(e);
        }
    }
}
