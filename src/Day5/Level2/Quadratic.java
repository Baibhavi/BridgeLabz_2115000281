package Day5.Level2;

import java.util.Scanner;
public class Quadratic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three number for equation : ax2+ bx + c");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        double[] roots = findRoots(a, b, c);
        System.out.print("The roots are:");
        for(double i : roots){
            System.out.print(i + " ");
        }
    }
    public static double[] findRoots(int a, int b, int c){
        double delta = Math.pow(b,2) + (4 * a * c);
        double[] roots ;
        if(delta > 0){
            roots = new double[2];
            roots[0]  = (-b + Math.sqrt(delta) / (2*a));
            roots[1]  = (-b - Math.sqrt(delta) / (2*a));
        } else if (delta == 0) {
            roots = new double[1];
            roots[0] = -b / (2*a);
        }
        else{
            roots = new double[0];
        }
        return roots;
    }
}
