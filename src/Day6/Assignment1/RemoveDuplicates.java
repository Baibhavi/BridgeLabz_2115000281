package Day6.Assignment1;

import java.util.Scanner;
public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String str = input.nextLine().trim();
        String result = "";
        for(int i = 0; i < str.length(); i++){
            char currentChar = str.charAt(i);
            if (result.indexOf(currentChar) != -1) {
                continue;
            }
            else{
                result += str.charAt(i);
            }
        }
        System.out.println("String without duplicates : " + result);
    }
}
