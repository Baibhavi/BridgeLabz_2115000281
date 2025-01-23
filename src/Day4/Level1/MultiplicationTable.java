package Day4.Level1;
import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number you table of:");
        int number = input.nextInt();
        int table[] = new int[10];
        for(int i = 0; i <10 ; i++){
            table[i] = (i+1) * number;
        }
        for(int i = 0; i < 10; i++){
            System.out.println(number + " x " + (i+1) + " = " + table[i]);
        }
        input.close();
    }
}
