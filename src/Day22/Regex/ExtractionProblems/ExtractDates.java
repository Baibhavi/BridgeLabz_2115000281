package Day22.Regex.ExtractionProblems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractDates {
    public static void main(String[] args) {
        String regex = "\\b\\d{2}/\\d{2}/\\d{4}\\b";
        Pattern pattern = Pattern.compile(regex);
        String input = "The events are scheduled for 12/05/2023, 15/08/2024, and 29/02/2020.";
        Matcher matcher = pattern.matcher(input);
        System.out.println("Dates : ");
        while(matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
