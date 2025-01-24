package Day4.Level1;
import java.util.Scanner;
public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];
        int sum = 0;
        int index = 0;
        System.out.println("Enter 10 numbers. Also enter -ve number or 0 to stop:");
        while(true){
            int num = input.nextInt();
            if(index == 10){
                break;
            }
            else{
                if(num <= 0){
                    numbers[index] = num;
                    index++;
                    break;
                }
            }
            numbers[index] = num;
            index++;
        }
        System.out.println("Numbers in the array are: ");
        for(int i = 0; i < index; i++){
            System.out.println(numbers[i]);
            sum += numbers[i];
        }
        System.out.println("Sum of all numbers are: " + sum);
    }
}
