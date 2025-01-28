package Day5.Level3;
import java.util.Random;
import java.util.Scanner;

public class MatrixOperations {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of rows and columns for matrices:");
        int rows = input.nextInt();
        int columns = input.nextInt();

        int[][] matrix1 = generateRandomMatrix(rows, columns);
        int[][] matrix2 = generateRandomMatrix(rows, columns);

        System.out.println("Matrix 1:");
        displayMatrix(matrix1);

        System.out.println("Matrix 2:");
        displayMatrix(matrix2);

        int[][] additionResult = addMatrices(matrix1, matrix2);
        System.out.println("Addition of Matrices:");
        displayMatrix(additionResult);

        int[][] subtractionResult = subtractMatrices(matrix1, matrix2);
        System.out.println("Subtraction of Matrices:");
        displayMatrix(subtractionResult);

        if (columns == matrix2.length) {
            int[][] multiplicationResult = multiplyMatrices(matrix1, matrix2);
            System.out.println("Multiplication of Matrices:");
            displayMatrix(multiplicationResult);
        } else {
            System.out.println("Matrix multiplication not possible with the given dimensions.");
        }

        int[][] transposeResult = transposeMatrix(matrix1);
        System.out.println("Transpose of Matrix 1:");
        displayMatrix(transposeResult);

        if (rows == 2 && columns == 2) {
            System.out.println("Determinant of 2x2 Matrix 1: " + determinant2x2(matrix1));
            System.out.println("Inverse of 2x2 Matrix 1:");
            displayMatrix(inverse2x2(matrix1));
        } else if (rows == 3 && columns == 3) {
            System.out.println("Determinant of 3x3 Matrix 1: " + determinant3x3(matrix1));
            System.out.println("Inverse of 3x3 Matrix 1:");
            displayMatrix(inverse3x3(matrix1));
        } else {
            System.out.println("Determinant and Inverse calculation is supported for 2x2 or 3x3 matrices only.");
        }
    }

    public static int[][] generateRandomMatrix(int rows, int columns) {
        Random rand = new Random();
        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = rand.nextInt(100);
            }
        }
        return matrix;
    }

    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int columns = matrix1[0].length;
        int[][] result = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }

    public static int[][] subtractMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int columns = matrix1[0].length;
        int[][] result = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        return result;
    }

    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int rows1 = matrix1.length;
        int cols1 = matrix1[0].length;
        int cols2 = matrix2[0].length;
        int[][] result = new int[rows1][cols2];
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                result[i][j] = 0;
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return result;
    }

    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        int[][] transpose = new int[columns][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
    }

    public static double[][] transposeMatrix(double[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        double[][] transpose = new double[columns][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
    }

    public static int determinant2x2(int[][] matrix) {
        return (matrix[0][0] * matrix[1][1]) - (matrix[0][1] * matrix[1][0]);
    }

    public static int determinant3x3(int[][] matrix) {
        int determinant = matrix[0][0] * ((matrix[1][1] * matrix[2][2]) - (matrix[1][2] * matrix[2][1]))
                - matrix[0][1] * ((matrix[1][0] * matrix[2][2]) - (matrix[1][2] * matrix[2][0]))
                + matrix[0][2] * ((matrix[1][0] * matrix[2][1]) - (matrix[1][1] * matrix[2][0]));
        return determinant;
    }

    public static double[][] inverse2x2(int[][] matrix) {
        int determinant = determinant2x2(matrix);
        if (determinant == 0) {
            throw new ArithmeticException("Matrix is not invertible.");
        }
        double[][] inverse = new double[2][2];
        inverse[0][0] = matrix[1][1];
        inverse[0][1] = -matrix[0][1];
        inverse[1][0] = -matrix[1][0];
        inverse[1][1] = matrix[0][0];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                inverse[i][j] /= determinant;
            }
        }
        return inverse;
    }

    public static double[][] inverse3x3(int[][] matrix) {
        int determinant = determinant3x3(matrix);
        if (determinant == 0) {
            throw new ArithmeticException("Matrix is not invertible.");
        }
        double[][] inverse = new double[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                inverse[i][j] = (determinant3x3(minor(matrix, i, j)) * ((i + j) % 2 == 0 ? 1 : -1)) / (double) determinant;
            }
        }

        return transposeMatrix(inverse);
    }

    public static int[][] minor(int[][] matrix, int row, int column) {
        int[][] minor = new int[2][2];
        int minorRow = 0, minorCol = 0;
        for (int i = 0; i < 3; i++) {
            if (i == row) continue;
            for (int j = 0; j < 3; j++) {
                if (j == column) continue;
                minor[minorRow][minorCol++] = matrix[i][j];
                if (minorCol == 2) {
                    minorCol = 0;
                    minorRow++;
                }
            }
        }
        return minor;
    }

    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    public static void displayMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
