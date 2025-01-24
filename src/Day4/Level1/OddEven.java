package Day4.Level1;
import java.util.Scanner;
public class OddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a natural number:");
        int number = input.nextInt();
        if(number < 1){
            System.out.println("Error: Not a natural number");
        }
        else{
            int size = (number/2) + 1;
            int[] odd = new int[size];
            int[] even = new int[size];
            int indexOdd = 0;
            int indexEven = 0;
            for(int i = 1; i <= number; i++){
                if(i % 2 != 0){
                    odd[indexOdd++] = i;
                }
                else{
                    even[indexEven++] = i;
                }
            }
            System.out.println("Odd numbers : ");
            for(int i = 0; i < size; i++){
                System.out.println(odd[i]);
            }
            System.out.println("Even numbers : ");
            for(int i = 0; i < size; i++){
                System.out.println(even[i]);
            }
        }
    }
}
