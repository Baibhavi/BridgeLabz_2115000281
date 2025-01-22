package Day2;
import java.util.Scanner;
public class LengthOfSidesOfSquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float perimeter = input.nextFloat();
        float lengthOfSides = perimeter/4;
        System.out.println("The length of the side is " + lengthOfSides + " whose perimeter is "+perimeter);
    }
}
