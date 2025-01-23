package Day3.Level1;
import java.util.Scanner;
public class OddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if(number <= 0){
            System.out.println("Not a natural number");
        }
        else{
            if(number % 2 == 0){
                System.out.println("Number is Even");
            }
            else{
                System.out.println("Number is Odd");
            }
        }
    }
}
