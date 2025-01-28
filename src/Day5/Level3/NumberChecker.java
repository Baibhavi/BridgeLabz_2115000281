package Day5.Level3;

import java.util.Scanner;
public class NumberChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = input.nextInt();
        int digits[] = digitArray(number);
        System.out.println("Number of digits in " + number + " is " + digitCounter(number));
        duckNumber(digits);
        armstrongNumber(digits, number);
        largestNumber(digits);
        smallestNumber(digits);
    }
    public static int digitCounter(int number){
        int counter = 0;
        while (number != 0) {
            counter++;
            number/=10;
        }
        return counter;
    }
    public static int[] digitArray(int number){
        int[] digit = new int[digitCounter(number)];
        int index = 0;
        while (number != 0) {
            digit[index++] = number%10;
            number /= 10;
        }
        return digit;
    }
    public static void duckNumber(int[] digits){
        boolean flag = false;
        for(int i : digits){
            if(i > 0){
                flag = true;
                break;
            }
        }
        if(flag == true){
            System.out.println("Duck number");
        }
        else {
            System.out.println("Not Duck number");
        }
    }
    public static void armstrongNumber(int[] digits, int number){
        int sum = 0;
        for(int i : digits){
            sum += Math.pow(i, 3);
        }
        if(sum == number){
            System.out.println("Armstrong Number");
        }
        else{
            System.out.println("Not Armstrong Number");
        }
    }
    public static void largestNumber(int[] digits){
        int max = Integer.MIN_VALUE;
        for(int i : digits){
            max = Math.max(max, i);
        }
        int max2 = Integer.MIN_VALUE;
        for(int i : digits){
            if(i == max)
                continue;

            max2 = Math.max(max2, i);
        }
        System.out.println("Largest digit is " + max +" and second largest digit is " + max2);
    }
    public static void smallestNumber(int[] digits){
        int min = Integer.MAX_VALUE;
        for(int i : digits){
            min = Math.min(min, i);
        }
        int min2 = Integer.MAX_VALUE;
        for(int i : digits){
            if(i == min)
                continue;

            min2 = Math.min(min2, i);
        }
        System.out.println("Smallest digit is " + min +" and second smallest digit is " + min2);
    }

}
