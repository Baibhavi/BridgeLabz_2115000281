package Day3.Level3;
import java.util.Scanner;
public class HarshadNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int sumOfDigits = 0;
        int originalNumber = number;
        while(number != 0){
            sumOfDigits += number%10;
            number /= 10;
        }
        if(originalNumber % sumOfDigits == 0){
            System.out.println(originalNumber + " is a Harshad number");
        }
        else{
            System.out.println(originalNumber + " is not a Harshad number");
        }
    }
}
