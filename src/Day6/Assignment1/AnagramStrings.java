package Day6.Assignment1;

import java.util.Arrays;
import java.util.Scanner;
public class AnagramStrings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two strings : ");
        String str1 = input.nextLine().trim();
        String str2 = input.nextLine().trim();
        if(str1.length() != str2.length()){
            System.out.println("Not Anagrams");
        }
        else {
            char[] strArray1 = str1.toCharArray();
            char[] strArray2 = str1.toCharArray();
            Arrays.sort(strArray1);
            Arrays.sort(strArray2);
            if(Arrays.equals(strArray1,strArray2)){
                System.out.println("Anagrams");
            }
            else{
                System.out.println("Not Anagrams");
            }
        }
    }
}
