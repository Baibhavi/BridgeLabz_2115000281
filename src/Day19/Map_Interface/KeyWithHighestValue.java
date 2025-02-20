package Day19.Map_Interface;

import java.util.HashMap;
import java.util.Map;
public class KeyWithHighestValue {
    public static String keyWithHighestValue(HashMap<String, Integer> map){
        int maxValue = Integer.MIN_VALUE;
        String maxKey = null;
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            if(entry.getValue() > maxValue){
                maxValue = entry.getValue();
                maxKey = entry.getKey();
            }
        }
        return maxKey;
    }
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("A", 10);
        map.put("B", 40);
        map.put("C", 20);
        System.out.println("Key with maximum value: " + keyWithHighestValue(map));
    }
}
