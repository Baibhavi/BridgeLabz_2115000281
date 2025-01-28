package Day5.Level3;
import java.util.Arrays;
import java.util.Scanner;
public class NumberChecker3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = input.nextInt();
        int digits[] = digitArray(number);
        System.out.println("Number of digits in " + number + " is " + digitCounter(number));
        int[] reverseDigit = digitArrayReverse(digits);
        duckNumber(digits);
        System.out.println("Array = " + Arrays.toString(digits));
        System.out.println("Reversed Array = " + Arrays.toString(reverseDigit));
        compareArray(digits, reverseDigit);
    }

    public static int digitCounter(int number) {
        int counter = 0;
        while (number != 0) {
            counter++;
            number /= 10;
        }
        return counter;
    }

    public static int[] digitArray(int number) {
        int[] digit = new int[digitCounter(number)];
        int index = digitCounter(number)-1;
        while (number != 0) {
            digit[index--] = number % 10;
            number /= 10;
        }
        return digit;
    }
    public static int[] digitArrayReverse(int[] digit) {
        int i = 0, j = digit.length-1;
        while(i <= j) {
            int temp = digit[i];
            digit[i] = digit[j];
            digit[j] = temp;
            i++;
            j--;
        }
        return digit;
    }
    public static void compareArray(int[] digit, int[] reverseDigit){
        boolean flag = false;
        for(int i = 0; i < digit.length; i++){
            if(digit[i] != reverseDigit[i])
                break;
            else if (digit[i] == reverseDigit[i]) {
                flag = true;
            }
        }
        if(flag == true){
            System.out.println("Arrays are same and the number is Palindrome");
        }
        else{
            System.out.println("Arrays are not same and the number is not Palindrome");
        }
    }
    public static void duckNumber(int[] digits) {
        boolean flag = false;
        for (int i : digits) {
            if (i > 0) {
                flag = true;
                break;
            }
        }
        if (flag == true) {
            System.out.println("Duck number");
        } else {
            System.out.println("Not Duck number");
        }
    }
}

