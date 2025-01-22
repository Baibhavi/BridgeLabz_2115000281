package Day2;

import java.util.Scanner;
public class DoubleOpt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = input.nextInt();
        double b = input.nextInt();
        double c = input.nextInt();
        double operation1 = a + b * c;
        double operation2 = a * b + c;
        double operation3 = c + a / b;
        double operation4 = a % b + c;
        System.out.println("The results of Int Operations are " + operation1 + " ," + operation2 + " ," + operation3 + " and " + operation4);
    }
}
