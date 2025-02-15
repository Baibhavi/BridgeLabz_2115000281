package Day16.StringBuilderProblems;

import java.util.HashSet;
public class RemoveDuplicates {
    public static String removedDuplicates(String str){
        StringBuilder sb = new StringBuilder();
        HashSet<Character> set = new HashSet<>();
        for(char ch : str.toCharArray()){
            if(!set.contains(ch)){
                sb.append(ch);
                set.add(ch);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "abbabbacddvvagka";
        String result = removedDuplicates(str);
        System.out.println("Original String: " + str);
        System.out.println("String wthout duplicate characters: " + result);
    }
}
