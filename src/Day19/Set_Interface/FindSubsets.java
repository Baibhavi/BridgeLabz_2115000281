package Day19.Set_Interface;

import java.util.HashSet;
import java.util.Set;
public class FindSubsets {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        set1.add(2);
        set1.add(3);
        set2.add(1);
        set2.add(2);
        set2.add(3);
        set2.add(4);
        boolean isSubset = checkSubset(set1, set2);
        System.out.println("Is Set1 a subset of Set2: " + isSubset);
    }
    public static boolean checkSubset(Set<Integer> set1, Set<Integer> set2){
        for(int i : set1){
            if(!set2.contains(i))
                return false;
        }
        return true;
    }
}
