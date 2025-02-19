package Day19.Set_Interface;

import java.util.HashSet;
import java.util.Set;
public class SymmetricDifference {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set2.add(3);
        set2.add(4);
        set2.add(5);
        Set<Integer> symmetricDifferSet = symmetricDifference(set1, set2);
        System.out.println("Symmetric Difference Set: " + symmetricDifferSet);
    }
    public static Set<Integer> symmetricDifference(Set<Integer> set1, Set<Integer> set2){
        Set<Integer> symmetricDifferSet = new HashSet<>();
        for(int i : set1){
            if(!set2.contains(i))
                symmetricDifferSet.add(i);
        }
        for(int i : set2){
            if(!set1.contains(i))
                symmetricDifferSet.add(i);
        }
        return symmetricDifferSet;
    }
}
