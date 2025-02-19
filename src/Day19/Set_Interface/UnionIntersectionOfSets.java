package Day19.Set_Interface;

import java.util.HashSet;
import java.util.Set;
public class UnionIntersectionOfSets {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set2.add(3);
        set2.add(4);
        set2.add(5);
        Set<Integer> unionSet = union(set1, set2);
        Set<Integer> intersectionSet = intersection(set1, set2);
        System.out.println("Union: " + unionSet);
        System.out.println("Intersection: " + intersectionSet);
    }
    public static Set<Integer> union(Set<Integer> set1, Set<Integer> set2){
        Set<Integer> unionSet = new HashSet<>(set1);
        for(int i : set2){
            unionSet.add(i);
        }
        return unionSet;
    }
    public static Set<Integer> intersection(Set<Integer> set1, Set<Integer> set2){
        Set<Integer> intersectSet = new HashSet<>();
        for(int i : set1){
            if(set2.contains(i))
                intersectSet.add(i);
        }
        return intersectSet;
    }
}
