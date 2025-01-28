package Day5.Level2;

import java.util.Scanner;
public class SumOfNaturalNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a natural number : ");
        int number = input.nextInt();
        if(number > 0){
            int sumWithFormula = number * (number+1)/2;
            int sumWithRecursion = sumOfN(number);
            System.out.println("Sum of " + number + " natural number using formula is " + sumWithFormula + " and sum using recursion " + sumWithRecursion);
        }
    }
    public static int sumOfN(int number){
        if(number == 0){
            return 0;
        }
        int sum = (number+sumOfN(number-1));
        return sum;
    }
}
