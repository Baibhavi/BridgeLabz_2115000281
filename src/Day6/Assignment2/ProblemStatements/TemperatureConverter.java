package Day6.Assignment2.ProblemStatements;
import java.util.Scanner;
public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Choose conversion type:");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        int choice = input.nextInt();
        System.out.print("Enter the temperature to convert: ");
        double temperature = input.nextDouble();
        input.close();
        double convertedTemperature;
        if (choice == 1) {
            convertedTemperature = fahrenheitToCelsius(temperature);
            System.out.println(temperature + " Fahrenheit is " + convertedTemperature + " Celsius");
        } else if (choice == 2) {
            convertedTemperature = celsiusToFahrenheit(temperature);
            System.out.println(temperature + " Celsius is " + convertedTemperature + " Fahrenheit");
        } else {
            System.out.println("Invalid choice");
        }
    }
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
}

