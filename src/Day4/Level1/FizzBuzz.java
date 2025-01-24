package Day4.Level1;
import java.util.Scanner;
public class FizzBuzz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = input.nextInt();
        if(number > 0){
            String result[] = new String[number+1];
            for(int i = 0; i <= number; i++){
                if(i % 3 == 0 && i % 5 == 0){
                    result[i] = "FizzBuzz";
                }
                else if(i % 3 ==0){
                    result[i] = "Fizz";
                } else if (i % 5 == 0) {
                    result[i] = "Buzz";
                }
                else{
                    result[i] = Integer.toString(i);
                }
            }
            System.out.println("The result is:");
            for(int i = 0; i <= number; i++){
                System.out.println("Position " + i + " = " + result[i]);
            }
        }
        input.close();
    }
}
