package Day6.Assignment1;
import java.util.Scanner;
public class LongestWord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = input.nextLine();
        String longestWord = findLongestWord(str);
        System.out.println("Longest word: " + longestWord);
    }

    public static String findLongestWord(String str) {
        String longest = "";
        int longestLength = 0;
        String currentWord = "";

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (currentChar == ' ' || i == str.length() - 1) {
                if (i == str.length() - 1 && currentChar != ' ') {
                    currentWord += currentChar;
                }
                if (currentWord.length() > longestLength) {
                    longest = currentWord;
                    longestLength = currentWord.length();
                }
                currentWord = "";
            } else {
                currentWord += currentChar;
            }
        }
        return longest;
    }
}

