package Day16.ChallengeProblems;

import java.util.Arrays;
public class LinearAndBinarySearch {
    public static int binarySearch(int[] num, int target){
        Arrays.sort(num);
        int left = 0, right = num.length-1;
        while(left <= right){
            int mid = left + (right-left)/2;
            if(num[mid] == target){
                return mid;
            } else if (num[mid] > target) {
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {3, 4, -1, 1};
        int target = 4;
        int firstMissingPositive = findFirstMissingPositive(nums);
        System.out.println("First missing positive integer: " + firstMissingPositive);
        int targetIndex = binarySearch(nums, target);
        System.out.println("Index of target " + target + ": " + targetIndex);
    }

    private static int findFirstMissingPositive(int[] nums) {
        int n = nums.length;
        for(int i = 0; i < n; i++){
            if(nums[i] <= 0 || nums[i] > n){
                nums[i] = n+1;
            }
        }
        for (int i = 0; i < n; i++) {
            int num = Math.abs(nums[i]);
            if (num <= n) {
                nums[num - 1] = -Math.abs(nums[num - 1]);
            }
        }
        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                return i + 1;
            }
        }
        return n + 1;
    }
}
