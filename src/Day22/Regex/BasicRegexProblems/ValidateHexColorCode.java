package Day22.Regex.BasicRegexProblems;

import java.util.regex.Pattern;
public class ValidateHexColorCode {
    public static void main(String[] args) {
        String regex = "#[0-9a-fA-F]{6}";
        Pattern pattern = Pattern.compile(regex);
        String[] hexColors = {"#FFA500", "#ff4500", "#123", "af1223"};
        for (String hexColor : hexColors){
            System.out.println("Hex Color Code " + hexColor + " is a valid code: " + pattern.matcher(hexColor).matches());
        }
    }
}
