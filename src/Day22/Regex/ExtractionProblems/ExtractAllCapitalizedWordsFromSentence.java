package Day22.Regex.ExtractionProblems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class ExtractAllCapitalizedWordsFromSentence {
    public static void main(String[] args) {
        String regex = "\\b[A-Z][a-z]*\\b";
        Pattern pattern = Pattern.compile(regex);
        String input = "The Eiffel Tower is in Paris and the Statue of Liberty is in New York.";
        Matcher matcher = pattern.matcher(input);
        System.out.println("Capitalized Words : ");
        while(matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
