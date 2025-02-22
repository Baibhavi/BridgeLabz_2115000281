package Day22.Regex.ReplaceAndModifyStrings;

public class SensorBadWords {
    public static void main(String[] args) {
        String[] badWords = {"damn", "stupid", "idiot"};
        String input = "This is a damn bad example with some stupid words.";
        for(String badWord : badWords){
            String regex = badWord;
            input = input.replaceAll(badWord, "****");
        }
        System.out.println(input);
    }
}
