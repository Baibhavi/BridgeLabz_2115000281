package Day22.Regex.AdvancedProblems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class ExtractProgrammingLanguageNamesFromText {
    public static void main(String[] args) {
        String regex = "\\b(Java|Python|JavaScript|Go|Php|C++|C|Ruby)\\b";
        String text = "I love Java, Python, and JavaScript, but I haven't tried Go yet.";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        while(matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
