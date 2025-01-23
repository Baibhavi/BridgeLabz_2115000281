package Day3.Level3;
import java.util.Scanner;
public class NumberOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int counter = 0;
        while(number !=0){
            counter++;
            number/=10;
        }
        System.out.println("The number of digits is " + counter);
    }
}
