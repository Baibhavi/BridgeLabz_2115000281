package Day5.Level1;

import java.util.Scanner;
public class PositiveNegativeZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int result = helper(number);
        System.out.println(result);
        input.close();
    }

    public static int helper(int number) {
        if(number > 0)
            return 1;
        else if(number < 0)
            return -1;
        else
            return 0;
    }
}
