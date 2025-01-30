package Day6.Assignment1;
import java.util.Scanner;
public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = input.nextLine();
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            boolean found = false;
            for (int j = 0; j < result.length(); j++) {
                if (result.charAt(j) == currentChar) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                result += currentChar;
            }
        }

        System.out.println("String without duplicates: " + result);
    }
}

