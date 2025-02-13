package Day14.HashMapAndHashFunction;

import java.util.HashMap;
public class TwoSumProblem {
    public static void main(String[] args) {
        int[] numbers = {1, 4, 45, 6, 10, 8};
        int target = 16;
        int[] pair = indexPair(numbers, target);
        if(pair.length == 2){
            System.out.println("Target Exists at indices: " + pair[0] + " and " + pair[1]);
        }
        else{
            System.out.println("Target Doesn't Exists");
        }
    }
    public static int[] indexPair(int[] numbers, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        int[] result = new int[2];
        for(int i : numbers){
            int complement = target - i;
            if(map.containsKey(complement)){
                result[0] = map.get(complement);
                result[1] = count;
                return result;
            }
            map.put(i, count);
            count++;
        }
        return new int[0];
    }
}
