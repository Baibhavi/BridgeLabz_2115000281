package Day17;

public class RecursiveIterativeFibonacci {
    public static long iterativeFiboTime(int n) {
        long start, end;
        int a = 0, b = 1, sum;
        start = System.nanoTime();
        for (int i = 2; i <= n; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        end = System.nanoTime();
        return end - start;
    }
    public static long recursiveFiboTime(int n) {
        long start, end;
        start = System.nanoTime();
        fibonacciRecursive(n);
        end = System.nanoTime();
        return end - start;
    }
    public static int fibonacciRecursive(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }
    public static void main(String[] args) {
        long iterateTime = iterativeFiboTime(40);
        long recursiveTime = recursiveFiboTime(40);
        System.out.println("Time taken by iterative approach is " + iterateTime + " and recursive approach is " + recursiveTime);
    }
}
