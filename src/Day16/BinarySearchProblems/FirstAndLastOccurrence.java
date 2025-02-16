package Day16.BinarySearchProblems;

import java.util.Arrays;
public class FirstAndLastOccurrence {
    public static int[] binarySearch(int[] arr, int target){
        int[] indices = {-1, -1};
        indices[0] = firstOccurrence(arr, target);
        indices[1] = lastOccurrence(arr, target);
        return indices;
    }
    public static int firstOccurrence(int[] arr, int target){
        int occurrence = -1;
        int left = 0, right = arr.length-1;
        while(left <= right){
            int mid = left + (right-left)/2;
            if(arr[mid] == target){
                occurrence = mid;
                right = mid - 1;
            } else if (arr[mid] > target) {
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }
        return occurrence;
    }
    public static int lastOccurrence(int[] arr, int target){
        int occurrence = -1;
        int left = 0, right = arr.length-1;
        while(left <= right){
            int mid = left + (right-left)/2;
            if(arr[mid] == target){
                occurrence = mid;
                left = mid + 1;
            } else if (arr[mid] > target) {
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }
        return occurrence;
    }
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 3, 4, 5};
        int target = 3;
        System.out.println("Target Element Found: " + Arrays.toString( binarySearch(array, target)));

    }
}
