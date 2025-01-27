package Day5.Level1;

import java.util.Scanner;
public class SumOfNaturalNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int number = input.nextInt();
        sumOfNumbers(number);
    }
    public static void sumOfNumbers(int number){
        int sum = 0;
        while(number != 0){
            sum += number;
            number--;
        }
        System.out.println("Sum = " + sum);
    }
}
