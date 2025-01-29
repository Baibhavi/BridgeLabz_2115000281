package Day6.Assignment2.ProblemStatements;

import java.util.Scanner;
public class MaximumOfThree {
    public static void main(String[] args) {
        int[] numbers = takeInput();
        System.out.println("Maximum of three numbers is " + findingMaximum(numbers[0], numbers[1], numbers[2]));
    }
    public static int[] takeInput(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        return new int[]{a,b,c};
    }
    public static int findingMaximum(int a, int b, int c){
        int max = Math.max(a,b);
        return Math.max(max,c);
    }
}
