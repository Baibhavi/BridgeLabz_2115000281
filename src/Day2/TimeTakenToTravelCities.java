package Day2;
import java.util.Scanner;
public class TimeTakenToTravelCities {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        String fromCity = input.nextLine();
        String viaCity = input.nextLine();
        String toCity = input.nextLine();
        double distanceFromtoVia = input.nextDouble();
        double distanceViaToFinalCity = input.nextDouble();
        // Time in minutes
        int timeTakenToVia = input.nextInt();
        int timeTakenToFinal = input.nextInt();
        double totalDistance = distanceFromtoVia + distanceViaToFinalCity;
        int totalTime = timeTakenToVia + timeTakenToFinal;
        System.out.println("The Total Distance travelled by " + name + " from " + fromCity + " to " + toCity + " via " + viaCity + " is " + totalDistance + " km and " + "the Total Time taken is " + totalTime + " minutes");
    }
}
