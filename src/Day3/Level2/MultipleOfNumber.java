package Day3.Level2;
import java.util.Scanner;
public class MultipleOfNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        System.out.println("The multiples of" + number + " are :");
        for(int i = 100; i >= 1; i--){
            if(number%i == 0){
                System.out.println(i);
            }
        }
        input.close();
    }
}
