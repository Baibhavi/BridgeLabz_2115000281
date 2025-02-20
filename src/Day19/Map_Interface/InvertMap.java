package Day19.Map_Interface;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class InvertMap {
    public static Map<Integer, List<String>> generateInvertedMap(Map<String, Integer> map ){
        Map<Integer, List<String>> invertedMap = new HashMap<>();
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            String key = entry.getKey();
            Integer value = entry.getValue();
            if(!invertedMap.containsKey(value)){
                invertedMap.put(value, new ArrayList<>());
            }
            invertedMap.get(value).add(key);
        }
        return invertedMap;
    }
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 1);
        Map<Integer, List<String>> invertedMap = generateInvertedMap(map);
        System.out.println(invertedMap);
    }
}
