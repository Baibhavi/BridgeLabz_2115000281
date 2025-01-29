package Day6.Assignment1;

import java.util.Scanner;
public class ReplaceWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter sentence, word you want to replace and new word in place of old one");
        String sentence = input.nextLine().trim();
        String targetWord = input.next();
        String newWord = input.next();
        String newSentence = replaceWord(sentence, targetWord, newWord);
        System.out.println("New sentence : " + newSentence);
    }
    public static String replaceWord(String sentence, String target, String newWord){
        if(sentence == null || target == null || newWord == null){
            return sentence;
        }
        return sentence.replace(target, newWord);
    }
}
