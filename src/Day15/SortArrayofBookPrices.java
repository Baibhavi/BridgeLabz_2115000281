package Day15;

import java.util.Arrays;
public class SortArrayofBookPrices {
    public static void mergeSort(int[] bookPrice, int left, int right){
       if(left < right){
           int mid = left + (right-left)/2;
           mergeSort(bookPrice, left, mid);
           mergeSort(bookPrice, mid+1, right);
           merge(bookPrice, left, mid, right);
       }
    }
    public static void merge(int[] bookPrice, int left, int mid, int right){
        int n1 = mid - left + 1, n2 = right - mid;
        int[] leftAr = new int[n1], rightAr = new int[n2];
        System.arraycopy(bookPrice, left, leftAr, 0, n1);
        System.arraycopy(bookPrice, mid+1, rightAr, 0, n2);
        int i = 0, j = 0, k = left;
        while(i < n1 && j < n2){
            if(leftAr[i] >= rightAr[j]){
                bookPrice[k++] = rightAr[j++];
            }
            else{
                bookPrice[k++] = leftAr[i++];
            }
        }
        while(i < n1)
            bookPrice[k++] = leftAr[i++];
        while(j < n2)
            bookPrice[k++] = rightAr[j++];
    }
    public static void main(String[] args) {
        int[] bookPrice = {100, 80, 150, 175, 200, 225, 140, 120};
        System.out.println("Book prices before sorting: " + Arrays.toString(bookPrice));
        mergeSort(bookPrice, 0, bookPrice.length-1);
        System.out.println("Book prices after sorting: " + Arrays.toString(bookPrice));
    }
}
