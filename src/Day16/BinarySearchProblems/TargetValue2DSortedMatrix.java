package Day16.BinarySearchProblems;

public class TargetValue2DSortedMatrix {
    public static boolean binarySearch(int[][] arr, int target) {
        if(arr == null || arr.length == 0 || arr[0].length == 0)
            return false;

        int row = arr.length, col = arr[0].length, left = 0, right = row * col - 1;
        while(left <= right){
            int mid = left + ( right - left)/2;
            int midValue = arr[mid/col][mid%col]; // 9/5 == row 1 , 9%5 == col 4... used to convert 1d to 2d array
            if(midValue == target){
                return true;
            } else if (midValue > target) {
                right = mid - 1;
            }else {
                left = mid + 1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}, {16, 17, 18, 19, 20}};
        int target = 12;
        System.out.println("Target Element Found: " + binarySearch(array, target));
    }
}
