package Day4.Level2;
import java.util.Scanner;
public class LargestOfDigitsInNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = input.nextInt();
        int originalNumber = number;
        int[] digits = new int[10];
        for(int i = 0; i < 10; i++){
            digits[i] = number%10;
            number /= 10;
        }
        int max = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int maxValueIndex = 0;
        for(int i = 0; i < digits.length; i++){
            if(max < digits[i]){
                max = digits[i];
                maxValueIndex = i;
            }
        }
        for(int i = 0; i < digits.length; i++){
            if(i == maxValueIndex)
                continue;
            else
                max2 = Math.max(max2, digits[i]);
        }
        System.out.println("The largest digit is " + max + " and the second largest digit is " + max2 + " in the number " + originalNumber);
    }
}
