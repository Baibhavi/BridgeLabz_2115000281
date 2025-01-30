package Day6.Assignment1;
import java.util.Scanner;
public class ReplaceWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence, the word you want to replace, and the new word to replace the old one:");
        String sentence = input.nextLine();
        String targetWord = input.next();
        String newWord = input.next();
        String newSentence = replaceWord(sentence, targetWord, newWord);
        System.out.println("New sentence: " + newSentence);
    }

    public static String replaceWord(String sentence, String target, String newWord) {
        if (sentence == null || target == null || newWord == null) {
            return sentence;
        }

        String result = "";
        int targetLength = target.length();
        int i = 0;

        while (i < sentence.length()) {
            boolean match = true;
            for (int j = 0; j < targetLength; j++) {
                if (i + j >= sentence.length() || sentence.charAt(i + j) != target.charAt(j)) {
                    match = false;
                    break;
                }
            }

            if (match) {
                result += newWord;
                i += targetLength;
            } else {
                result += sentence.charAt(i);
                i++;
            }
        }

        return result;
    }
}
