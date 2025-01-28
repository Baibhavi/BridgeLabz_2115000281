package Day5.Level3;

import java.util.Scanner;
public class CollinearPoints {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter point-1 x1 and y1:");
        double x1 = input.nextInt(), y1 = input.nextInt();
        System.out.println("Enter point-2 x2 and y2:");
        double x2 = input.nextInt(), y2 = input.nextInt();
        System.out.println("Enter point-3 x3 and y3:");
        double x3 = input.nextInt(), y3 = input.nextInt();
        boolean collinearSlope = areCollinearBySlope(x1, y1, x2, y2, x3, y3);
        boolean collinearArea = areCollinearByArea(x1, y1, x2, y2, x3, y3);
        System.out.println("Are the points collinear by slope method? " + collinearSlope);
        System.out.println("Are the points collinear by area method? " + collinearArea);
    }
    public static boolean areCollinearBySlope(double x1, double y1, double x2, double y2, double x3, double y3) {
        double slopeAB = (y2 - y1) / (x2 - x1);
        double slopeBC = (y3 - y2) / (x3 - x2);
        double slopeAC = (y3 - y1) / (x3 - x1);
        return (slopeAB == slopeBC) && (slopeBC == slopeAC);
    }
    public static boolean areCollinearByArea(double x1, double y1, double x2, double y2, double x3, double y3) {
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        return area == 0;
    }
}
