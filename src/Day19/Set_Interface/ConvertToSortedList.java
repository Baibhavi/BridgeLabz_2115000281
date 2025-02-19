package Day19.Set_Interface;

import java.util.*;
public class ConvertToSortedList {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(5);
        set.add(3);
        set.add(9);
        set.add(1);
        List<Integer> sortedList = convertSetToSortedList(set);
        System.out.println(sortedList);
    }
    public static List<Integer> convertSetToSortedList(Set<Integer> set){
        List<Integer> list = new ArrayList<>();
        for(int i : set){
            list.add(i);
        }
        Collections.sort(list);
        return list;
    }
}
