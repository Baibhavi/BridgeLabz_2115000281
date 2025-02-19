package Day19.List_Interface;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
public class FrequencyOfElements {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Orange");
        list.add("Banana");
        list.add("Apple");
        list.add("Grapes");
        list.add("Orange");
        list.add("Apple");
        System.out.println(countFrequency(list));
    }
    public static HashMap countFrequency(List<String> list){
        HashMap<String, Integer> map = new HashMap<>();
        for(String s : list){
            map.put(s , map.getOrDefault(s, 0)+1);
        }
        return map;
    }
}
