package Day22.Regex.AdvancedProblems;

import java.util.regex.Pattern;
public class ValidateCreditCardNumber {
    public static void main(String[] args) {
        String visaRegex = "4[0-9]{15}";
        String mastercardRegex = "5[0-9]{15}";
        String[] creditCardNumbers = {"4123456789012345", "5123456789012345", "6123456789012345", "512345678901234", "41234567890123456"};
        for(String cardNumber : creditCardNumbers){
            boolean isVisaCard = Pattern.matches(visaRegex, cardNumber);
            boolean isMasterCard = Pattern.matches(mastercardRegex, cardNumber);
            if(isVisaCard){
                System.out.println(cardNumber + " → Visa, Valid");
            }
            else if (isMasterCard) {
                System.out.println(cardNumber + " → MasterCard, Valid");
            } else {
                System.out.println(cardNumber + " → Invalid");
            }
        }
    }
}
