package Day19.Set_Interface;

import java.util.HashSet;
import java.util.Set;
public class CheckEqualityOfTwoSets {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for(int i = 1; i <= 3; i++){
            set1.add(i);
        }
        for(int i = 3; i > 0; i--){
            set2.add(i);
        }
        System.out.println("Is Set-1 equals to Set-2: " + compareSet(set1, set2));
    }
    public static boolean compareSet(Set<Integer> set1, Set<Integer> set2){
        for(int i : set1){
            if(!set2.contains(i)){
                return false;
            }
        }
        return true;
    }
}
