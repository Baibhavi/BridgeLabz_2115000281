package Day22.Regex.BasicRegexProblems;

import java.util.regex.Pattern;
public class ValidateUsername {
    public static void main(String[] args) {
        String regex = "[a-zA-Z][a-zA-Z0-9_]{4,14}";
        Pattern pattern = Pattern.compile(regex);
        String[] usernames = {"user_123", "123user", "us", "valid_User123"};
        for(String username : usernames){
            System.out.println("Username " + username + " is a valid username :" + pattern.matcher(username).matches());
        }
    }
}
