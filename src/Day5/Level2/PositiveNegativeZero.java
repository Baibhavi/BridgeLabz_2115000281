package Day5.Level2;

import java.util.Scanner;
public class PositiveNegativeZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 5 numbers: ");
        int[] numbers = new int[5];
        for(int i = 0; i < 5; i++){
            numbers[i] = input.nextInt();
        }
        for(int i : numbers){
            isPositive(i);
        }
        compare(numbers[0], numbers[numbers.length-1]);
    }
    public static void isPositive(int num){
        if(num > 0){
                isEven(num);
        } else if (num < 0) {
            System.out.println(num + " is Negative");
        }
        else{
            System.out.println(num + " is Zero");
        }
    }
    public static void isEven(int num){
        if(num % 2 == 0){
            System.out.println(num + " is Positive Even");
        }
        else{
            System.out.println(num + " is Positive Odd");
        }
    }
    public static void compare(int start, int end){
        if(start > end){
            System.out.println(start + " is Greater");
        }
        else if(start < end){
            System.out.println(end + " is Greater");
        }
        else{
            System.out.println("The first and last numbers are equal");
        }
    }
}
