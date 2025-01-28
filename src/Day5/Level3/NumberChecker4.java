package Day5.Level3;
import java.util.Scanner;
public class NumberChecker4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = input.nextInt();
        isPrime(number);
        isNeon(number);
        isSpy(number);
        isAutomorphic(number);
        isBuzz(number);
    }
    public static void isPrime(int number){
        boolean flag = true;
        if(number > 1){
            for(int i = 2; i <number; i++){
                if(number % i == 0){
                    flag = false;
                    System.out.println("Not Prime");
                    break;
                }
            }
            if(flag ==true)
                System.out.println("Prime");
        }
        else{
            System.out.println("Not valid");
        }
    }
    public static void isNeon(int number){
        int square = (int) Math.pow(number, 2);
        int sum = 0;
        while(square != 0){
            sum += square%10;
            square /= 10;
        }
        if(sum == number){
            System.out.println("Neon Number");
        }
        else{
            System.out.println("Not Neon number");
        }
    }
    public static void isSpy(int number){
        int sum = 0, product = 1;
        while(number != 0){
            int digit = number % 10;
            sum += digit;
            product *= digit;
            number /= 10;
        }
        if(sum == product){
            System.out.println("Spy number");
        }
        else{
            System.out.println("Not a Spy number");
        }
    }
    public static void isAutomorphic(int number){
        int square = number*number;
        if(square % 10 == number){
            System.out.println("Automorphic Number");
        }
        else{
            System.out.println("Not Automorphic Number");
        }
    }
    public static void isBuzz(int number){
        int lastDigit = number % 10;
        if(lastDigit == 7 || number % 7 == 0){
            System.out.println("Buzz Number");
        }
        else{
            System.out.println("Not a Buzz number");
        }
    }
}


