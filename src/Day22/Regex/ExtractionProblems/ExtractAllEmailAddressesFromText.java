package Day22.Regex.ExtractionProblems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class ExtractAllEmailAddressesFromText {
    public static void main(String[] args) {
        String regex = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9._]+\\.[a-zA-Z]{2,}";
        Pattern pattern = Pattern.compile(regex);
        String input = "Contact us at support@example.com and info@company.org";
        Matcher matcher = pattern.matcher(input);
        while(matcher.find()){
            System.out.println("Emails : " + matcher.group());
        }
    }
}
