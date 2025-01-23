package Day3.Level2;
import java.util.Scanner;
public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        boolean isPrime = true;
        if(number <= 1) {
            isPrime = false;
        }
        else{
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if(isPrime){
            System.out.println(number + " is Prime");
        }
        else{
            System.out.println(number + " is not Prime");
        }
    }
}
