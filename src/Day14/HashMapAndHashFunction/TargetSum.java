package Day14.HashMapAndHashFunction;

import java.util.HashMap;
import java.util.Map;
public class TargetSum {
    public static void main(String[] args) {
        int[] numbers = {1, 4, 45, 6, 10, 8};
        int target = 16;
        if(existPair(numbers, target)){
            System.out.println("Target Exists");
        }
        else{
            System.out.println("Target Doesn't Exists");
        }
    }
    public static boolean existPair(int[] numbers, int target){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : numbers){
            int complement = target - i;
            if(map.containsKey(complement)){
                return true;
            }
            map.put(i, 1);
        }
        return false;
    }
}
