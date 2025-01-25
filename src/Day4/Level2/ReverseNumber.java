package Day4.Level2;
import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number you want to reverse: ");
        long number = input.nextLong();
        long originalNumber = number;
        int numOfDigits = 0;
        while(number != 0){
            numOfDigits++;
            number /= 10;
        }
        long[] digits = new long[numOfDigits];
        number = originalNumber;
        int index = 0;
        while(number != 0){
            digits[index++] = number % 10;
            number /= 10;
        }
        System.out.println("The reverse of " + originalNumber + " is :");
        for(int i = 0; i < numOfDigits; i++){
            System.out.print(digits[i]);
        }
    }
}
