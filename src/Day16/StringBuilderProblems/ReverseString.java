package Day16.StringBuilderProblems;

public class ReverseString {
    public static String reverseStr(String str){
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.reverse();
        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "Hello";
        String reversed = reverseStr(str);
        System.out.print("Original: " +str+"\nReversed: " + reversed);
    }
}
