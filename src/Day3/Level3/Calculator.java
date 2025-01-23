package Day3.Level3;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double first = input.nextDouble();
        double second = input.nextDouble();
        System.out.println("Enter an operator (+, -, / ,*) :");
        String op = input.next();
        switch (op){
            case "+" :
                System.out.println("Result = " + (first+second));
                break;
            case "-" :
                System.out.println("Result = " + (first-second));
                break;
            case "*" :
                System.out.println("Result = " + (first*second));
                break;
            case "/" :
                System.out.println("Result = " + (first/second));
                break;
            default:
                System.out.println("Invalid Operator");
        }
        input.close();
    }
}
