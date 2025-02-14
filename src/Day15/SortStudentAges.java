package Day15;

import java.util.Arrays;
public class SortStudentAges {
    public static void countingSort(int[] ages){
        int n = ages.length;
        int[] count = new int[9];
        Arrays.fill(count, 0);
        for(int i : ages){
            count[i-10]++;
        }
        for(int i = 1; i < count.length; i++){
            count[i] += count[i-1];
        }
        int[] sortedAges = new int[n];
        for(int i = n-1; i >=0; i--){
            sortedAges[--count[ages[i]-10]] = ages[i];
        }
        System.arraycopy(sortedAges, 0, ages, 0, n);
    }
    public static void main(String[] args) {
        int[] ages = {12, 17, 15, 11, 18, 14, 13, 16, 14, 12, 16, 18, 13};
        System.out.println("Ages before sorting: " + Arrays.toString(ages));
        countingSort(ages);
        System.out.println("Ages after sorting: " + Arrays.toString(ages));
    }
}
