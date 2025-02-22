package Day22.Regex.AdvancedProblems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateIPAddress {
    public static void main(String[] args) {
        String regex = "^((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";
        Pattern pattern = Pattern.compile(regex);
        String[] ipAddresses = {"192.168.1.1", "255.255.255.255", "256.256.256.256", "192.168.1", "192.168.1.256"};
        for (String ip : ipAddresses) {
            Matcher matcher = pattern.matcher(ip);
            boolean isValid = matcher.matches();
            System.out.println(ip + " → " + isValid);
        }
    }
}
