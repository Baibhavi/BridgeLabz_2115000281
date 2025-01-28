package Day5.Level3;

import java.util.Scanner;
public class EuclideanDistance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter point-1 x1 and y1 :");
        double x1 = input.nextInt(), y1 = input.nextInt();
        System.out.println("Enter point-2 x2 and y2 :");
        double x2 = input.nextInt(), y2 = input.nextInt();
        double euclidDistance = eulideanDistance(x1, y1, x2, y2);
        System.out.println("Euclidean Distance: " + euclidDistance);
        double[] lineEquation = lineEquation(x1, y1, x2, y2);
        System.out.println("Equation of the line: y = " + lineEquation[0] + "x + " + lineEquation[1]);
    }
    public static double eulideanDistance(double x1, double y1, double x2, double y2){
        double distance = Math.sqrt(Math.pow((x2-x1), 2)) + Math.sqrt(Math.pow((y2-y1), 2));
        return distance;
    }
    public static double[] lineEquation(double x1, double y1, double x2, double y2){
        double m = (y2-y1)/(x2-x1);
        double b = y1 - m * x1;
        return new double[]{m,b};
    }
}
