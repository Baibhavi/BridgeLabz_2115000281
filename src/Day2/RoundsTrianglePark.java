package Day2;
import java.util.Scanner;
public class RoundsTrianglePark {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float side1 = input.nextFloat();
        float side2 = input.nextFloat();
        float side3 = input.nextFloat();
        float perimeter = side1 + side2 + side3;
        float distance = 5;
        float rounds = distance/perimeter;
        System.out.println("The total number of rounds the athlete will run is " + rounds + " to complete 5 km");
    }
}
