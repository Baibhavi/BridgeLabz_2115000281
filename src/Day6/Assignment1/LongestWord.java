package Day6.Assignment1;

import java.util.Scanner;
public class LongestWord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String str = input.nextLine().trim();
        String strArray[] = str.split(" ");
        String longest = "";
        int longestLength = 0;
        for(String i : strArray){
            if(i.length() > longestLength){
                longest = i;
                longestLength = i.length();
            }
        }
        System.out.println(longest);
    }
}
