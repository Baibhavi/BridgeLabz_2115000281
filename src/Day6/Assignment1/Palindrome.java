package Day6.Assignment1;

import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String str = input.nextLine();
        str.trim();
        int start = 0, end = str.length()-1;
        boolean palindrome = true;
        while(start <= end){
            if(str.charAt(start) != str.charAt(end)){
                palindrome = false;
                break;
            }
            start++;
            end--;
        }
        if(palindrome == true){
            System.out.println("String is Palindrome");
        }
        else{
            System.out.println("String is not Palindrome");
        }
    }
}
