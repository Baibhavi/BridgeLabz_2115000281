package Day5.Level1;

import java.util.Scanner;
public class SmallestAndLargest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 numbers : ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        int[] result = findSmallestAndLargest(num1, num2, num3);
        System.out.println("Smallest Number = " + result[0] + ", Largest Number = " + result[1]);
    }
    public static int[] findSmallestAndLargest(int number1, int number2, int number3){
        int[] result = new int[2];
        if(number1 > number2 && number1 > number3){
            result[1] = number1;
            if(number2 > number3){
                result[0] = number3;
            }
            else{
                result[0] = number2;
            }
        }
        else if(number2 > number1 && number2 > number3){
            result[1] = number2;
            if(number1 > number3){
                result[0] = number3;
            }
            else{
                result[0] = number1;
            }
        }
        else{
            result[1] = number3;
            if(number1 > number2){
                result[0] = number2;
            }
            else{
                result[0] = number1;
            }
        }
        return result;
    }
}
