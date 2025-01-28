package Day5.Level3;
import java.util.Arrays;
import java.util.Scanner;
public class NumberChecker5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = input.nextInt();

        int[] factorsOfNum = factors(number);
        System.out.println("The factors are " + Arrays.toString(factorsOfNum));
        System.out.println("Maximum factor: " + greatestFactors(factorsOfNum));
        System.out.println("Sum of factors: " + sumFactors(factorsOfNum));
        System.out.println("Product of factors: " + productFactors(factorsOfNum));
        System.out.println("Product of cube of factors: " + productOfCubes(factorsOfNum));
        System.out.println("Is perfect number: " + isPerfectNumber(number));
        System.out.println("Is abundant number: " + isAbundantNumber(number));
        System.out.println("Is deficient number: " + isDeficientNumber(number));
        System.out.println("Is strong number: " + isStrongNumber(number));
    }

    public static int[] factors(int number) {
        int counter = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                counter++;
            }
        }
        int[] factor = new int[counter];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factor[index++] = i;
            }
        }
        return factor;
    }

    public static int greatestFactors(int[] factors) {
        int max = Integer.MIN_VALUE;
        for (int i : factors) {
            max = Math.max(max, i);
        }
        return max;
    }

    public static int sumFactors(int[] factors) {
        int sum = 0;
        for (int i : factors) {
            sum += i;
        }
        return sum;
    }

    public static int productFactors(int[] factors) {
        int product = 1;
        for (int i : factors) {
            product *= i;
        }
        return product;
    }

    public static int productOfCubes(int[] factors) {
        int product = 1;
        for (int i : factors) {
            product *= Math.pow(i, 3);
        }
        return product;
    }

    public static boolean isPerfectNumber(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum == number;
    }

    public static boolean isAbundantNumber(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum > number;
    }

    public static boolean isDeficientNumber(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum < number;
    }

    public static boolean isStrongNumber(int number) {
        int sum = 0;
        int temp = number;
        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum == number;
    }

    private static int factorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        }
        int fact = 1;
        for (int i = 2; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }
}
