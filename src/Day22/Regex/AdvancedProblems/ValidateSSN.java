package Day22.Regex.AdvancedProblems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class ValidateSSN {
    public static void main(String[] args) {
        String regex = "\\b\\d{3}-\\d{2}-\\d{4}\\b";
        Pattern pattern = Pattern.compile(regex);
        String[] ssns = {"123-45-6789", "123456789", "987-65-4321"};
        for (String ssn : ssns) {
            Matcher matcher = pattern.matcher(ssn);
            boolean isValid = matcher.matches();
            System.out.println("\"" + ssn + "\" is " + (isValid ? "valid" : "invalid"));
        }
    }
}
