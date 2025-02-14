package Day15;

import java.util.Arrays;
public class SortJobApplicants {
    public static void heapSort(int[] salary){
        int n = salary.length;
        for(int i = n/2 -1; i >= 0; i--){
            heapify(salary, n, i);
        }
        for(int i = n-1; i >= 0; i--){
            int temp = salary[0];
            salary[0] = salary[i];
            salary[i] = temp;
            heapify(salary, i, 0);
        }
    }
    public static void heapify(int[] salary, int n, int i){
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;
        if(l < largest && salary[l] > salary[largest]){
            largest = l;
        }
        if(r < largest && salary[r] > salary[largest]){
            largest = r;
        }
        if(largest != i){
            int temp = salary[i];
            salary[i] = salary[largest];
            salary[largest] = temp;
            heapify(salary, n, largest);
        }
    }
    public static void main(String[] args) {
        int[] salaryDemands = {50000, 70000, 60000, 80000, 40000, 55000};
        System.out.println("Salary demands before sorting: " + Arrays.toString(salaryDemands));
        heapSort(salaryDemands);
        System.out.println("Salary demands after sorting: " + Arrays.toString(salaryDemands));
    }
}
