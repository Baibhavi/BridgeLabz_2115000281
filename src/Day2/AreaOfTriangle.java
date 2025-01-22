package Day2;
import java.util.Scanner;
public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double baseCm = input.nextDouble();
        double heightCm = input.nextDouble();
        double areaCm = 0.5*baseCm*heightCm;
        double areaInch = areaCm/2.54;
        double areaFeet = areaInch/12;
        System.out.println("Area of triangle in cm is " + areaCm + " while in feet is " + areaFeet +" and inches is " + areaInch);
    }
}
