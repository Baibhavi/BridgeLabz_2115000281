package Day4.Level1;
import java.util.Scanner;
public class MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.println("Enter a number between 6 to 9:");
        int number = input.nextInt();
        int[] multiplicationResult = new int[10];
        if(number > 9 || number < 6){
            System.out.println("Invalid Response");
        }
        else{
            for(int i = 0; i < multiplicationResult.length; i++){
                multiplicationResult[i] = number * (i+1);
            }
            for(int i = 0; i < multiplicationResult.length; i++){
                System.out.println(number + " * " + (i+1) + " = " + multiplicationResult[i]);
            }
        }
        input.close();
    }
}
