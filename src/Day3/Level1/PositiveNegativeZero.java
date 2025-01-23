package Day3.Level1;
import java.util.Scanner;
public class PositiveNegativeZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float number = input.nextFloat();
        if(number > 0){
            System.out.println("Positive");
        }
        else if(number == 0){
            System.out.println("Zero");
        }
        else{
            System.out.println("Negative");
        }
    }
}
