package Day15;

import java.util.Arrays;

public class SortEmployeeIDs {
    public static int[] selectionSort(int[] employeeId){
        int n = employeeId.length;
        for(int i = 1; i < n; i++){
            int key = employeeId[i];
            int j = i -1;
            while(j >= 0 && employeeId[j] > key){
                employeeId[j+1] = employeeId[j];
                j--;
            }
            employeeId[j+1] = key;
        }
        return employeeId;
    }
    public static void main(String[] args) {
        int [] employeeId = {101, 94, 120, 54, 69, 115, 84, 110, 73};
        System.out.println("Employee ID's before sorting: " + Arrays.toString(employeeId));
        System.out.println("Employee ID's after sorting: " + Arrays.toString(selectionSort(employeeId)));
    }
}
