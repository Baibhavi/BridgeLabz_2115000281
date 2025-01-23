package Day3.Level1;
import java.util.Scanner;
public class SumOfNaturalNum2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int sum = 0;
        if(number <= 0){
            System.out.println("Not a natural number");
        }
        else{
            for(int i = number; i > 0; i--){
                sum += i;
            }
            int sumWithFormula = number * (number+1)/2;
            System.out.println("The result using formula is " + sumWithFormula + "\nResult using loop is " + sum);
        }
    }
}
