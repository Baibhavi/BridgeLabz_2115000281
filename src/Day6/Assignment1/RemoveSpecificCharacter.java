package Day6.Assignment1;
import java.util.Scanner;
public class RemoveSpecificCharacter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string and character to be removed: ");
        String str = input.nextLine().trim();
        char ch = input.next().charAt(0);
        String result = removeCharacter(str, ch);
        System.out.println("Modified String: " + result);
    }

    public static String removeCharacter(String str, char ch) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ch) {
                result += str.charAt(i);
            }
        }
        return result;
    }
}

