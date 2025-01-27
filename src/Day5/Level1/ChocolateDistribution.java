package Day5.Level1;

import java.util.Scanner;
public class ChocolateDistribution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of chocolates and number of children :");
        int numOfChoco = input.nextInt();
        int numOfChild = input.nextInt();
        int result[] = findRemainderAndQuotient(numOfChoco, numOfChild);
        System.out.println("Each children will get "+result[0] +" and remaining chocolates are " + result[1]);
    }
    public static int[] findRemainderAndQuotient(int number, int divisor){
        int[] result = new int[2];
        result[0] = number/divisor;
        result[1] = number%divisor;
        return result;
    }
}
