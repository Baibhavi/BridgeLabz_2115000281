package Day15;
import java.util.Arrays;
public class SortExamScores {
    public static void selectionSort(int[] scores) {
        int n = scores.length;
        for (int i = 0; i < n - 1; i++){
            int minIndex = i;
            for(int j = i+1; j < n; j++){
                if(scores[j] < scores[minIndex]){
                    minIndex = j;
                }
            }
            int temp = scores[minIndex];
            scores[minIndex] = scores[i];
            scores[i] = temp;
        }
    }
    public static void main(String[] args) {
        int[] scores = {678, 567, 870, 690, 466, 765};
        System.out.println("Scores before sorting: " + Arrays.toString(scores));
        selectionSort(scores);
        System.out.println("Scores after sorting: " + Arrays.toString(scores));
    }
}
