package Day4.Level2;
import java.util.Scanner;
public class LargestOfDigits2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number:");
        long number = input.nextLong();
        long originalNumber = number;
        int maxLength = 10;
        int index = 0;
        int[] digits = new int[maxLength];

        while (number != 0) {
            if (index == maxLength) {
                maxLength *= 2;
                int[] temp = new int[maxLength];
                System.arraycopy(digits, 0, temp, 0, digits.length);
                digits = temp;
            }
            digits[index] = (int)(number % 10);
            number /= 10;
            index++;
        }

        int max = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int maxValueIndex = 0;

        for (int i = 0; i < index; i++) {
            if (max < digits[i]) {
                max = digits[i];
                maxValueIndex = i;
            }
        }

        for (int i = 0; i < index; i++) {
            if (i == maxValueIndex) {
                continue;
            }
            max2 = Math.max(max2, digits[i]);
        }
        System.out.println("The largest digit is " + max + " and the second largest digit is " + max2 + " in the number " + originalNumber);
    }
}
