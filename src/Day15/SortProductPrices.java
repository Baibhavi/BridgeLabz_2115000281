package Day15;

import java.util.Arrays;
public class SortProductPrices {
    public static void quickSort(int[] productPrice, int low, int high){
        if(low < high) {
            int pi = partition(productPrice, low, high);
            quickSort(productPrice, low, pi - 1);
            quickSort(productPrice, pi + 1, high);
        }
    }
    public static int partition(int[] productPrice, int low, int high){
        int pivot = productPrice[high];
        int i = low - 1;
        for(int j= low; j < high; j++){
            if(productPrice[j] < pivot){
                i++;
                int temp = productPrice[i];
                productPrice[i] = productPrice[j];
                productPrice[j] = temp;
            }
        }
        int temp = productPrice[i+1];
        productPrice[i+1] = productPrice[high];
        productPrice[high] = temp;
        return i+1;
    }
    public static void main(String[] args) {
        int[] productPrice = {100, 80, 150, 175, 200, 225, 140, 120};
        System.out.println("Book prices before sorting: " + Arrays.toString(productPrice));
        quickSort(productPrice, 0, productPrice.length-1);
        System.out.println("Book prices after sorting: " + Arrays.toString(productPrice));
    }
}
