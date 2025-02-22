package Day22.Regex.ReplaceAndModifyStrings;

public class ReplaceMultipleSpacesWithSingleSpace {
    public static void main(String[] args) {
        String text = "This  is  an example  with    multiple spaces.";
        String replacedText = text.replaceAll("\\s+", " ");
        System.out.println("Original: " + text);
        System.out.println("Formatted: " + replacedText);
    }
}
