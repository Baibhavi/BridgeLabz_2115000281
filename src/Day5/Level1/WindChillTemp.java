package Day5.Level1;
import java.util.Scanner;

public class WindChillTemp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter temperature and windspeed : ");
        float temperature = input.nextFloat();
        float windspeed = input.nextFloat();
        WindChillTemp obj = new WindChillTemp();
        double windchill = obj.calculateWindChill(temperature, windspeed);
        System.out.println("Windchill = " + windchill);
    }
    public double calculateWindChill(double temperature, double windSpeed){
        double windchill = 35.74 + 0.6215 * temperature + (0.4275*temperature-35.75) * Math.pow(windSpeed, 0.16);
        return windchill;
    }
}
