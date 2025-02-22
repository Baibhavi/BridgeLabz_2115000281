package Day22.Regex.ExtractionProblems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractLinksFromWebPage {
    public static void main(String[] args) {
        String regex = "https?://(www\\.)?([a-zA-Z0-9.-]+)";
        Pattern pattern = Pattern.compile(regex);
        String input = "Visit https://www.google.com and http://example.org for more info.";
        Matcher matcher = pattern.matcher(input);
        System.out.println("Links : ");
        while(matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
