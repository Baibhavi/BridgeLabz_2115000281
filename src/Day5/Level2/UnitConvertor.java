package Day5.Level2;

import java.util.Scanner;
public class UnitConvertor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the distance in kilometers :");
        double distance = input.nextDouble();
        double miles = kiloToMile(distance);
        double kilometer = mileToKilo(miles);
        double feet = metersToFeet(distance);
        double meter = feetToMeter(distance);
        System.out.println("Miles = " + miles + ", Kilometer = " + kilometer + ", Feet = " + feet + ", Meter = " + meter);
    }
    public static double kiloToMile(double distance){
        double km2miles = 0.621371;
        return km2miles*distance;
    }
    public static double mileToKilo(double distance){
        double miles2km = 1.60934;
        return miles2km*distance;
    }
    public static double metersToFeet(double distance){
        double meters2feet = 3.28084* distance * 1000;
        return meters2feet;
    }
    public static double feetToMeter(double distance){
        double feet2meters = 0.3048 * distance * 1000;
        return feet2meters;
    }
}
