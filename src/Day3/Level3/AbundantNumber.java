package Day3.Level3;
import java.util.Scanner;
public class AbundantNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int sumOfDivisors = 0;
        for(int i = 1; i <= number/2; i++){
            if(number % i == 0){
                sumOfDivisors += i;
            }
        }
        if(sumOfDivisors > number){
            System.out.println(number + " is an Abundant Number");
        }
        else{
            System.out.println(number + " is not an Abundant Number");
        }
        input.close();
    }
}
