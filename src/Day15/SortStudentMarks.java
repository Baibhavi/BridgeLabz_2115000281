package Day15;

import java.util.Arrays;
public class SortStudentMarks {
    public static float[] bubbleSort(float[] marks){
        boolean swapped;
        int n = marks.length;
        for(int i = 0; i < n; i++){// no of passes = n-1
            swapped = false;
            for(int j = 0; j < n-i-1; j++){// elements left unsorted or comparisons
                if(marks[j] > marks[j+1]){
                    swapped = true;
                    float temp = marks[j];
                    marks[j] = marks[j+1];
                    marks[j+1] = temp;
                }
            }
            if(!swapped)
                break;
        }
        return marks;
    }
    public static void main(String[] args) {
        float marks[] = {90, 86, 76, 98, 95};
        System.out.println("Before sorting: " + Arrays.toString(marks));
        System.out.println("After sorting: " + Arrays.toString(bubbleSort(marks)));
    }
}
