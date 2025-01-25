package Day4.Level2;
import java.util.Scanner;
public class FrequencyOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number:");
        long number = input.nextLong();
        String numStr = Long.toString(number);
        int[] frequency = new int[10];
        for (int i = 0; i < numStr.length(); i++) {
            char digit = numStr.charAt(i);
            frequency[digit - '0']++;
        }
        System.out.println("Digit frequencies in the number " + number + ":");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + ": " + frequency[i]);
            }
        }
    }
}

