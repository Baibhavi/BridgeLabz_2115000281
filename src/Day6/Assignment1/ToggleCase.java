package Day6.Assignment1;
import java.util.Scanner;
public class ToggleCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = input.nextLine().trim();
        String toggleCase = toggleCaseString(str);
        System.out.println("Toggle case: " + toggleCase);
    }
    public static String toggleCaseString(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (currentChar >= 'A' && currentChar <= 'Z') {
                result += (char) (currentChar + ('a' - 'A'));
            } else if (currentChar >= 'a' && currentChar <= 'z') {
                result += (char) (currentChar - ('a' - 'A'));
            } else {
                result += currentChar;
            }
        }
        return result;
    }
}
