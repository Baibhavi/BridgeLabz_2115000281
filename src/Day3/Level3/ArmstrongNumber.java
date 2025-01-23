package Day3.Level3;
import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int sum = 0;
        int OriginalNumber = number;
        while (number != 0){
            int digit = number%10;
            sum += (digit*digit*digit);
            number /= 10;
        }
        if(sum == OriginalNumber){
            System.out.println("Armstrong Number");
        }
        else{
            System.out.println("Not Armstrong Number");
        }
    }
}
