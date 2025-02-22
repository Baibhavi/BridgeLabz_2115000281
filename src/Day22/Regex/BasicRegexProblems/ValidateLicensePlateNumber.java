package Day22.Regex.BasicRegexProblems;

import java.util.regex.Pattern;
public class ValidateLicensePlateNumber {
    public static void main(String[] args) {
        String regex = "[A-Z]{2}\\d{4}";
        Pattern pattern = Pattern.compile(regex);
        String[] licensePlateNumbers = {"AB1234","A12345"};
        for(String licenceNumber : licensePlateNumbers){
            System.out.println("Licence Plate number " + licenceNumber + " is valid : " + pattern.matcher(licenceNumber).matches());
        }
    }
}
