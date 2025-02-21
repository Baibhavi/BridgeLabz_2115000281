package Day21;

import java.util.Scanner;
public class NestedTryCatchBlock {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = input.nextInt();
        int[] array = new int[size];
        for(int i = 0; i < size; i++){
            array[i] = input.nextInt();
        }
        System.out.println("Enter the index: ");
        int index = input.nextInt();
        System.out.println("Enter the divisor: ");
        int divisor = input.nextInt();
        try{
            int element = array[index];
            System.out.println("Element = " + element);
            try{
                int result = element/divisor;
                System.out.println("Result = " + result);
            }
            catch (ArithmeticException e){
                System.out.println("Cannot divide by zero!");
            }
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid array index!");
        }
    }
}
