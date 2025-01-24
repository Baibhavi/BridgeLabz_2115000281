package Day4.Level1;
import java.util.Scanner;
public class MultiDimensionArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of the matrix");
        int row = input.nextInt();
        int col = input.nextInt();
        int[][] matrix = new int[row][col];
        int array[] = new int[row*col];
        int indexOfArray = 0;
        System.out.println("Enter the elements:");
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++) {
                matrix[i][j] = input.nextInt();
            }
        }
        System.out.println("Elements of matrix: ");
        for(int i =0; i < row; i++){
            for(int j = 0; j < col; j++){
                System.out.print(matrix[i][j] + " ");
                array[indexOfArray++] = matrix[i][j];
            }
            System.out.println();
        }
        System.out.println("Elements of array: ");
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        input.close();
    }
}
