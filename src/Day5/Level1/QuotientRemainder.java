package Day5.Level1;

import java.util.Scanner;
public class QuotientRemainder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number and divisor :");
        int number = input.nextInt();
        int divisor = input.nextInt();
        int[] result = findRemainderAndQuotient(number, divisor);
        System.out.println("Quotient = " + result[0] + " Remainder = " + result[1]);
    }
    public static int[] findRemainderAndQuotient(int number, int divisor){
        int result[] = new int[2];
        result[0] = number/divisor;
        result[1] = number%divisor;
        return result;
    }
}
