package Day6.Assignment1;
import java.util.Scanner;
public class SubstringOccurence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string and substring: ");
        String str = input.nextLine().trim();
        String subStr = input.nextLine().trim();

        int occurrenceCount = countSubstringOccurrences(str, subStr);
        System.out.println("Occurrence of substring: " + occurrenceCount);
    }

    public static int countSubstringOccurrences(String str, String subStr) {
        int subStrLength = subStr.length();
        int counter = 0;

        for (int i = 0; i <= str.length() - subStrLength; i++) {
            boolean match = true;
            for (int j = 0; j < subStrLength; j++) {
                if (str.charAt(i + j) != subStr.charAt(j)) {
                    match = false;
                    break;
                }
            }
            if (match) {
                counter++;
            }
        }
        return counter;
    }
}

