package Day5.Level2;
import java.util.Scanner;
public class UnitConvertor3{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the temperature in Fahrenheit:");
        double temperatureInFahrenheit = input.nextDouble();
        double celsius = convertFahrenheitToCelsius(temperatureInFahrenheit);
        double fahrenheit = convertCelsiusToFahrenheit(celsius);
        System.out.println("Fahrenheit = " + temperatureInFahrenheit + ", Celsius = " + celsius + ", Fahrenheit (from Celsius) = " + fahrenheit);

        System.out.println("Enter the weight in pounds:");
        double weightInPounds = input.nextDouble();
        double kilograms = convertPoundsToKilograms(weightInPounds);
        double pounds = convertKilogramsToPounds(kilograms);
        System.out.println("Pounds = " + weightInPounds + ", Kilograms = " + kilograms + ", Pounds (from Kilograms) = " + pounds);

        System.out.println("Enter the volume in gallons:");
        double volumeInGallons = input.nextDouble();
        double liters = convertGallonsToLiters(volumeInGallons);
        double gallons = convertLitersToGallons(liters);
        System.out.println("Gallons = " + volumeInGallons + ", Liters = " + liters + ", Gallons (from Liters) = " + gallons);
    }

    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double convertPoundsToKilograms(double pounds) {
        double pounds2kilograms = 0.453592;
        return pounds * pounds2kilograms;
    }

    public static double convertKilogramsToPounds(double kilograms) {
        double kilograms2pounds = 2.20462;
        return kilograms * kilograms2pounds;
    }

    public static double convertGallonsToLiters(double gallons) {
        double gallons2liters = 3.78541;
        return gallons * gallons2liters;
    }

    public static double convertLitersToGallons(double liters) {
        double liters2gallons = 0.264172;
        return liters * liters2gallons;
    }
}
