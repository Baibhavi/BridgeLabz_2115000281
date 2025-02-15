package Day16.StringBufferProblems;

public class ConcatenateStrings {
    public static StringBuffer concatenateStr(String[] arrayOfStr){
        StringBuffer concatenatedStrings = new StringBuffer();
        for(String s : arrayOfStr){
            concatenatedStrings.append(s + " ");
        }
        return concatenatedStrings;
    }
    public static void main(String[] args) {
        String[] arrayOfStrings = {"Apple", "Mango", "Banana", "Grapes", "Oranges", "Guava", "Avocado"};
        StringBuffer concatStr = concatenateStr(arrayOfStrings);
        System.out.println("Concatenated String: " + concatStr);
    }
}
