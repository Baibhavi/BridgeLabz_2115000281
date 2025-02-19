package Day19.List_Interface;

import java.util.ArrayList;
import java.util.List;
public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(4);
        list  = removeDuplicates(list);
        System.out.println(list);
    }
    public static List<Integer> removeDuplicates(List<Integer> list){
        List<Integer> newList = new ArrayList<>();
        for(int i : list){
            if(!newList.contains(i)){
                newList.add(i);
            }
        }
        return newList;
    }
}
