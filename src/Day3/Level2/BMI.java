package Day3.Level2;
import java.util.Scanner;
public class BMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter weight in kg and height in cm :");
        double weight = input.nextDouble();
        double height = input.nextDouble();
        double heightM = height /1000;
        double bmi = weight / (heightM * heightM);
        if(bmi <= 18.4){
            System.out.println("Underweight");
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("Normal");
        } else if (bmi >= 25.0 && bmi <= 39.9) {
            System.out.println("Overweight");
        } else if (bmi >= 40.0) {
            System.out.println("Obese");
        }
    }
}
