package Day3.Level1;
import java.util.Scanner;
public class SumOfNaturalNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int sum = 0;
        if(number <= 0){
            System.out.println("Not a natural number");
        }
        else{
            int temp = number;
            while(temp > 0){
                sum += temp--;
            }
            int sumWithFormula = number * (number+1)/2;
            System.out.println("The result using formula is " + sumWithFormula + "\nResult using loop is " + sum);
        }

    }
}
