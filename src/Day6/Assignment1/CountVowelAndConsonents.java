package Day6.Assignment1;

import java.util.Scanner;
public class CountVowelAndConsonents {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = input.nextLine();
        int vowelCounter = 0, consonantCounter = 0;
        str.trim().toLowerCase();
        for(char i : str.toCharArray()){
            if(i >= 'a' && i <= 'z'){
                if(i == 'a' || i == 'e' || i == 'i' || i == 'o' || i == 'u'){
                    vowelCounter++;
                }
                else{
                    consonantCounter++;
                }
            }
        }
        System.out.println("Vowel in string is " + vowelCounter);
        System.out.println("Consonants in string is " + consonantCounter);
    }
}
