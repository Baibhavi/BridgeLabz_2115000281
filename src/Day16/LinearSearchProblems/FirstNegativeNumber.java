package Day16.LinearSearchProblems;

public class FirstNegativeNumber {
    public static int findNegative(int[] arr){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < 0)
                return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] numberArray = {2,3,5,0,39,-1,12,9};
        int negNumberIdx = findNegative(numberArray);
        System.out.println("Index of first negative number: " + negNumberIdx);
    }
}
