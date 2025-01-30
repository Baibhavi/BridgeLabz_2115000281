package Day6.Assignment1;
import java.util.Scanner;
public class MostFrequentCharacter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = input.nextLine();
        char mostFrequentChar = findMostFrequentCharacter(str);
        System.out.println("Most frequent character is: " + mostFrequentChar);
    }

    public static char findMostFrequentCharacter(String str) {
        char mostFreq = '\0';
        int maxCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (currentChar == str.charAt(j)) {
                    count++;
                }
            }
            if (count > maxCount) {
                mostFreq = currentChar;
                maxCount = count;
            }
        }
        return mostFreq;
    }
}
