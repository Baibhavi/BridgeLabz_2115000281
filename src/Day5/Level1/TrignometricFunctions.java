package Day5.Level1;
import java.util.Scanner;
public class TrignometricFunctions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an angle in degrees:");
        double angle = input.nextDouble();
        TrignometricFunctions obj = new TrignometricFunctions();
        double[] trigValues = obj.calculateTrigonometricFunctions(angle);
        System.out.println("Sine: " + trigValues[0]);
        System.out.println("Cosine: " + trigValues[1]);
        System.out.println("Tangent: " + trigValues[2]);
    }
    public double[] calculateTrigonometricFunctions(double angle){
        double radians = Math.toRadians(angle);
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);
        double[] trigValues = {sine, cosine, tangent};
        return trigValues;
    }
}
