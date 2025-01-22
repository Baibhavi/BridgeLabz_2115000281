package Day2;
import java.util.Scanner;
public class DistanceInYards {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double distanceInFeet = input.nextInt();
        double distanceInYard = distanceInFeet/3;
        double distanceInMile = distanceInYard/1760;
        System.out.println("Distance in feet is "+distanceInFeet+" while in yards is "+distanceInYard+" and miles is "+distanceInMile);
    }
}
