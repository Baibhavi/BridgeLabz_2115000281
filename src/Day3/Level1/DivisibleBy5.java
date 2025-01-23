package Day3.Level1;
import java.util.Scanner;
public class DivisibleBy5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        boolean result = false;
        if(number % 5 == 0){
            result = true;
        }
        System.out.println("Is the number " + number + " divisible by 5? " + result);
    }
}
