package Day16.BinarySearchProblems;

import java.util.ArrayList;
public class PeakElement {
    public static ArrayList<Integer> binarySearch(int[] arr){
        ArrayList<Integer> peakElements = new ArrayList<>();
        int left = 0, right = arr.length-1;
        while(left < right){
            int mid = left + (right - left)/2;
            if((mid == 0 || arr[mid] > arr[mid+1]) && (mid == arr.length-1 || arr[mid] > arr[mid-1])){
                peakElements.add(arr[mid]);
            }
            if (mid > 0 && arr[mid] < arr[mid-1]) {
                right = mid-1;
            }
            else{
                left = mid + 1;
            }
        }
        return peakElements;
    }
    public static void main(String[] args) {
        int[] array = {3, 4, 5, 6, 1, 2, 0};
        System.out.println("Peak Elements: " + binarySearch(array));
    }
}
