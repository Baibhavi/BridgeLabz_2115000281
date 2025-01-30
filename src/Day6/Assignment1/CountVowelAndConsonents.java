package Day6.Assignment1;
import java.util.Scanner;
public class CountVowelAndConsonents {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = input.nextLine();
        int vowelCounter = 0, consonantCounter = 0;
        char[] strArray = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                strArray[i] = (char) (ch + ('a' - 'A'));
            } else {
                strArray[i] = ch;
            }
        }
        for (int i = 0; i < strArray.length; i++) {
            char ch = strArray[i];
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowelCounter++;
                } else {
                    consonantCounter++;
                }
            }
        }

        System.out.println("Vowels in string: " + vowelCounter);
        System.out.println("Consonants in string: " + consonantCounter);
    }
}


