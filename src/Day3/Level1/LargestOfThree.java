package Day3.Level1;
import java.util.Scanner;
public class LargestOfThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float number1 = input.nextFloat();
        float number2 = input.nextFloat();
        float number3 = input.nextFloat();
        if(number1 > number2 && number1 > number3){
            System.out.println("Is the first number the largest? Yes\nIs the second number the largest? No\nIs the third number the largest? No");
        }
        else if(number2 > number1 && number2 > number3){
            System.out.println("Is the first number the largest? No\nIs the second number the largest? Yes\nIs the third number the largest? No");
        }
        else{
            System.out.println("Is the first number the largest? No\nIs the second number the largest? No\nIs the third number the largest? Yes");
        }
    }
}
