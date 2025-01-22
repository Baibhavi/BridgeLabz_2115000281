package Day2;
import java.util.Scanner;
public class IntOperation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int operation1 = a + b * c;
        int operation2 = a * b + c;
        int operation3 = c + a / b;
        int operation4 = a % b + c;
        System.out.println("The results of Int Operations are " + operation1 + " ," + operation2 + " ," + operation3 + " and " + operation4);
    }
}
