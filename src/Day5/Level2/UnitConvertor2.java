package Day5.Level2;
import java.util.Scanner;
public class UnitConvertor2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the distance in yards:");
        double distanceInYards = input.nextDouble();
        double feet = convertYardsToFeet(distanceInYards);
        double yardsFromFeet = convertFeetToYards(feet);
        double metersFromInches = convertInchesToMeters(feet);
        double centimetersFromInches = convertInchesToCm(feet);
        double inchesFromMeters = convertMetersToInches(centimetersFromInches);
        System.out.println("Yards = " + distanceInYards + ", Feet = " + feet + ", Meters = " + metersFromInches + ", Centimeters = " + centimetersFromInches + ", Inches = " + inchesFromMeters);
    }

    public static double convertYardsToFeet(double yards) {
        double yards2feet = 3;
        return yards * yards2feet;
    }

    public static double convertFeetToYards(double feet) {
        double feet2yards = 0.333333;
        return feet * feet2yards;
    }

    public static double convertMetersToInches(double meters) {
        double meters2inches = 39.3701;
        return meters * meters2inches;
    }

    public static double convertInchesToMeters(double inches) {
        double inches2meters = 0.0254;
        return inches * inches2meters;
    }

    public static double convertInchesToCm(double inches) {
        double inches2cm = 2.54;
        return inches * inches2cm;
    }
}
