package Day6.Assignment1;
import java.util.Scanner;
public class CompareString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two strings: ");
        String str1 = input.nextLine().trim();
        String str2 = input.nextLine().trim();

        String comparisonResult = compareStrings(str1, str2);
        System.out.println(comparisonResult);
    }

    public static String compareStrings(String str1, String str2) {
        int str1Length = str1.length();
        int str2Length = str2.length();
        int minLength = str1Length < str2Length ? str1Length : str2Length;

        for (int i = 0; i < minLength; i++) {
            char char1 = str1.charAt(i);
            char char2 = str2.charAt(i);

            if (char1 < char2) {
                return str1 + " comes before " + str2 + " in lexicographical order";
            } else if (char1 > char2) {
                return str2 + " comes before " + str1 + " in lexicographical order";
            }
        }

        if (str1Length < str2Length) {
            return str1 + " comes before " + str2 + " in lexicographical order";
        } else if (str1Length > str2Length) {
            return str2 + " comes before " + str1 + " in lexicographical order";
        } else {
            return "Both strings are equal in lexicographical order";
        }
    }
}
