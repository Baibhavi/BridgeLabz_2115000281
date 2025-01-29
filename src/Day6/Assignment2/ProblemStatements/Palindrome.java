package Day6.Assignment2.ProblemStatements;

import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int number = input.nextInt();
        input.close();
        if(isPalindrome(number)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }

    public static boolean isPalindrome(int number) {
        int temp = number;
        int reverse = 0;
        while(temp != 0){
            int digit = temp%10;
            reverse = reverse * 10 + digit;
            temp /= 10;
        }
        return number==reverse;
    }
}
