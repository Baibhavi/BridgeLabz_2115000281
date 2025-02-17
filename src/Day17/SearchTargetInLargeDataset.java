package Day17;

import java.util.Arrays;
import java.util.Random;
public class SearchTargetInLargeDataset {
    public static int binarySearch(int[] arr, int target){
        int left = 0, right = arr.length-1;
        while(left <= right){
            int mid = left + (right-left)/2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] < target){
                left = mid + 1;
            }
            else{
                right = mid -1;
            }
        }
        return -1;
    }
    public static int linearSearch(int[] arr, int target){
        for(int i = 0; i < arr.length; i ++){
            if(arr[i] == target)
                return i;

        }
        return -1;
    }
    public static long measureBinarySearchTime(int[] arr, int target){
        Arrays.sort(arr); // if array is sorted before searching
        long start = System.nanoTime();
        binarySearch(arr, target);
        long end = System.nanoTime();
        return end-start;
    }
    public static long measureLinearSearchTime(int[] arr, int target){
        long start = System.nanoTime();
        linearSearch(arr, target);
        long end = System.nanoTime();
        return end-start;
    }
    public static void main(String[] args) {
        int[] datasetSizes = {1000, 10000, 1000000};
        int target = 20;
        for(int i : datasetSizes){
            int[] randomData = generateData(i);
            long linearTime = measureLinearSearchTime(randomData, target);
            long binaryTime = measureBinarySearchTime(randomData, target);
            System.out.println("Time taken by Binary Search is " + binaryTime + " and Linear Search is " + linearTime + " for dataset of " + i + " elements\n");
        }
    }
    public static int[] generateData(int size){
        Random random = new Random();
        int[] dataArray = new int[size];
        for(int i = 0; i < size; i++){
            dataArray[i] = random.nextInt(size*10);
        }
        return dataArray;
    }
}
