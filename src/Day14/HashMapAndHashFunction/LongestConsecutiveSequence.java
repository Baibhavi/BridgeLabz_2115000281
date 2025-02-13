package Day14.HashMapAndHashFunction;

import java.util.HashSet;
public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};
        System.out.println("Length of the longest consecutive sequence: " + longestConsecutive(nums));
    }
    public static int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        HashSet<Integer> numSet = new HashSet<>();
        for(int num : nums){
            numSet.add(num);
        }
        int maxLength = 0;
        for(int num : nums){
            if(!numSet.contains(num-1)){
                int currentNum = num;
                int currentStreak = 1;
                while (numSet.contains(currentNum + 1)) {
                    currentNum += 1;
                    currentStreak += 1;
                }
                maxLength = Math.max(maxLength, currentStreak);
            }
        }
        return maxLength;
    }
}
