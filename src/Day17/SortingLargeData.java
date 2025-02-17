package Day17;

import java.util.Random;

public class SortingLargeData {
    public static long quickSortTime(int[] arr){
        long start = System.nanoTime();
        quickSort(arr, 0, arr.length-1);
        long end = System.nanoTime();
        return end - start;
    }
    public static void quickSort(int[] arr, int low, int high){
        if(low < high){
            int p = partition(arr, low, high);
            quickSort(arr, low, p-1);
            quickSort(arr, p+1, high);
        }
    }
    public static int partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int i = low-1;
        for(int j = low ; j < high; j++){
            if(arr[j]<pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        return i+1;
    }
    public static long mergeSortTime(int[] arr){
        long start = System.nanoTime();
        mergeSort(arr, 0, arr.length-1);
        long end = System.nanoTime();
        return end - start;
    }
    public static void mergeSort(int[] arr, int left, int right){
        if(left < right){
            int mid = left + (right-left)/2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid+1, right);
            merge(arr, left, mid, right);
        }
    }
    public static void merge(int[] arr, int left, int mid, int right){
        int n1 = mid-left+1, n2 = right-mid;
        int[] leftAr = new int[n1] , rightAr = new int[n2];
        System.arraycopy(arr, left, leftAr,0, n1);
        System.arraycopy(arr, mid+1, rightAr,0, n2);
        int i = 0, j = 0, k = left;
        while(i < n1 && j < n2){
            if(leftAr[i] <= rightAr[j]){
                arr[k++] = leftAr[j++];
            }
            else{
                arr[k++] = rightAr[i++];
            }
        }
        while(i < n1){
            arr[k++] = leftAr[i++];
        }
        while(j < n2){
            arr[k++] = rightAr[j++];
        }
    }
    public static long bubbleSortTime(int[] arr){
        boolean swap;
        int n = arr.length;
        long start = System.nanoTime();
        for(int i = 0; i < n; i++){
            swap = false;
            for(int j = 0; j < n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap = true;
                }
            }
            if(!swap)
                break;
        }
        long end = System.nanoTime();
        return end - start;
    }
    public static int[] generateDataset(int size){
        Random random = new Random();
        int[] arr = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = random.nextInt(size*10);
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] dataSizes = {1000, 10000, 1000000};
        for(int i : dataSizes){
            int[] dataSet = generateDataset(i);
            long bubbleTime = bubbleSortTime(dataSet);
            long mergeTime = mergeSortTime(dataSet);
            long quickTime = quickSortTime(dataSet);
            System.out.println("Time taken by sorting algorithms: BubbleSort - " + bubbleTime + ", MergeSort - " + mergeTime + ", QuickSort - " + quickTime);
        }
    }
}
