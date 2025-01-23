package Day3.Level2;
import java.util.Scanner;
public class FactorOfNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        for(int i = 1; i < number-1; i++){
            if(number%i == 0){
                System.out.println(i);
            }
        }
    }
}
