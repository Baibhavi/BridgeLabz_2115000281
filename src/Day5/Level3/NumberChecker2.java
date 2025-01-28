package Day5.Level3;
import java.util.Arrays;
import java.util.Scanner;
public class NumberChecker2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = input.nextInt();
        int digits[] = digitArray(number);
        System.out.println("Number of digits in " + number + " is " + digitCounter(number) + "\n Sum of digits = " + sumOfDigits(digits) + "\n Sum of squares of digits " + sumOfSquares(digits));
        harshadNumber(digits, number);
        frequency(digits);
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
        int index = 0;
        while (number != 0) {
            digit[index++] = number % 10;
            number /= 10;
        }
        return digit;
    }
    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for(int i : digits){
            sum += i;
        }
        return sum;
    }
    public static int sumOfSquares(int[] digits) {
        int sum = 0;
        for(int i : digits){
            sum += Math.pow(i, 2);
        }
        return sum;
    }
    public static void harshadNumber(int[] digits, int number) {
        int sum = Arrays.stream(digits).sum();
        if(number % sum == 0){
            System.out.println("It is a Harshad number");
        }
        else{
            System.out.println("It is not a Harshad number");
        }
    }
    public static void frequency(int[] digits) {
        int[][] digitFreq = new int[10][2];

        for (int i = 0; i < 10; i++) {
            digitFreq[i][0] = i;
        }
        for (int digit : digits) {
            digitFreq[digit][1]++;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("Digit: " + digitFreq[i][0] + ", Frequency: " + digitFreq[i][1]);
        }
    }

}
