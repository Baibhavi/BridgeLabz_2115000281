package Day4.Level1;
import java.util.Scanner;
public class ArrayOfFactors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();
        int maxIndex = 10;
        int index = 0;
        int[] factors = new int[maxIndex];
        for(int i = 1; i <= number; i++){
            if(number % i == 0){
                if(index == maxIndex){
                    maxIndex *= 2;
                    int[] temp = new int[maxIndex];
                    System.arraycopy(factors, 0, temp, 0, factors.length);
                    factors = temp;
                }
                factors[index++] = i;
            }
        }
        System.out.println("The factors of " + number + " are:");
        for(int i = 0; i < factors.length; i++){
            System.out.println(factors[i]);
        }
    }
}
