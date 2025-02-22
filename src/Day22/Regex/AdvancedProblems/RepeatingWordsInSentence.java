package Day22.Regex.AdvancedProblems;

import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RepeatingWordsInSentence {
    public static void main(String[] args) {
        String input = "This is is a repeated repeated word test.";
        String regex = "\\b(\\w+)\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        HashSet<String> words = new HashSet<>();
        HashSet<String> repeatingWords = new HashSet<>();
        while(matcher.find()){
            String word = matcher.group(1);
            if(!words.add(word)){
                repeatingWords.add(word);
            }
        }
        System.out.println("Repeating Words: " + String.join(", ", repeatingWords));
    }
}
