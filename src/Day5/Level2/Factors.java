package Day5.Level2;

import java.util.Scanner;
public class Factors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();
        int[] factors = findFactors(number);
        System.out.println("Factors of " + number +" are :");
        for(int i : factors){
            System.out.print(i + " ");
        }
        System.out.println("\nThe sum of factors is " + sumOfFactors(factors));
        System.out.println("The product of factors is " + productOfFactors(factors));
        System.out.println("The sum of factors is " + sumOfSquare(factors));
    }

    public static int[] findFactors(int number) {
        int count = 0;
        for(int i = 1; i <= number; i++ ){
            if(number % i == 0)
                count++;
        }
        int[] result = new int[count];
        int index = 0;
        for(int i = 1; i <= number; i++ ){
            if(number % i == 0)
                result[index++] = i;
        }
        return result;
    }
    public static int sumOfFactors(int[] factors){
        int sum = 0;
        for(int i : factors){
            sum += i;
        }
        return sum;
    }
    public static int productOfFactors(int[] factors){
        int product = 1;
        for(int i : factors){
            product *= i;
        }
        return product;
    }
    public static int sumOfSquare(int[] factors){
        int sumSq = 0;
        for(int i : factors){
            sumSq += Math.pow(i, 2);
        }
        return sumSq;
    }
}
