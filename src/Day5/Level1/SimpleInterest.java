package Day5.Level1;
import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter principal, rate of interest and time: ");
        double principal = input.nextDouble();
        double roi = input.nextDouble();
        double time = input.nextDouble();
        double result = simpleInterest(principal, roi, time);
        System.out.println("The Simple Interest is " + result + " for Principal " + principal + ", Rate of Interest " + roi + " and Time " + time);
    }
    public static double simpleInterest(double principal, double roi, double time){
        double si = principal*roi*time/100;
        return si;
    }
}
