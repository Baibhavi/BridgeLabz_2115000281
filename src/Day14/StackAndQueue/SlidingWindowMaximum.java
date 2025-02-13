package Day14.StackAndQueue;

import java.util.Deque;
import java.util.LinkedList;
public class SlidingWindowMaximum {
    public static void main(String[] args) {
        int array[] = {2,3,41,7,3,8,10,23};
        int k = 3;
    }
    public static int[] maxSlidingWindow(int[] nums, int k) {
        if(nums == null || nums.length == 0 )
            return new int[0];
        int n = nums.length;
        int result[] = new int[n-k+1];
        Deque<Integer> deque = new LinkedList<>();
        for(int i = 0; i < n; i++){
            while(!deque.isEmpty() && deque.peek() < i - k + 1){
                deque.poll();
            }
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
                deque.pollLast();
            }
            deque.offer(i);
            if (i >= k - 1) {
                result[i - k + 1] = nums[deque.peek()];
            }
        }
        return result;
    }
}
