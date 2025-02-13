package Day14.HashMapAndHashFunction;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class ZeroSumSubarrays {
    public static List<int[]> findZeroSumSubarrays(int[] arr) {
        List<int[]> result = new ArrayList<>();
        Map<Integer, List<Integer>> sumMap = new HashMap<>();
        sumMap.put(0, new ArrayList<>());
        sumMap.get(0).add(-1);
        int cummulativeSum = 0;
        for(int i = 0; i < arr.length; i++){
            cummulativeSum += arr[i];
            if(sumMap.containsKey(cummulativeSum)){
                List<Integer> indexes = sumMap.get(cummulativeSum);
                for(int j : indexes){
                    result.add(new int[]{j + 1, i});
                }
            }
            if (!sumMap.containsKey(cummulativeSum)) {
                sumMap.put(cummulativeSum, new ArrayList<>());
            }
            sumMap.get(cummulativeSum).add(i);
        }

        return result;

    }
    public static void main(String[] args) {
        int[] arr = {6, 3, -1, -3, 4, -2, 2, 4, 6, -12, -7, 7};
        List<int[]> subarrays = findZeroSumSubarrays(arr);

        System.out.println("Zero-sum subarrays:");
        for (int[] subarray : subarrays) {
            System.out.println("Start: " + subarray[0] + ", End: " + subarray[1]);
        }
    }
}
