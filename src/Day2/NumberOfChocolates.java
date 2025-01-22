package Day2;
import java.util.Scanner;
public class NumberOfChocolates {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOfChocolates = input.nextInt();
        int numberOfChildren = input.nextInt();
        int eachChildrenGets = numberOfChocolates/numberOfChildren;
        int remainingChocolate = numberOfChocolates%numberOfChildren;
        System.out.println("The number of chocolates each child gets is " + eachChildrenGets + " and the number of remaining chocolates are " + remainingChocolate);
    }
}
