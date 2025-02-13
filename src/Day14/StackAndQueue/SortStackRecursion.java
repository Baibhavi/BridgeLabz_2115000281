package Day14.StackAndQueue;

import java.util.Stack;
public class SortStackRecursion {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(20);
        stack.push(7);
        stack.push(5);
        System.out.println("Stack without sorting: ");
        displayStack(stack);
        sortStack(stack);
        System.out.println("Stack after sorting:");
        displayStack(stack);
    }

    public static void sortStack(Stack<Integer> stack) {
        if(!stack.isEmpty()){
            int temp = stack.pop();
            sortStack(stack);
            sortInsert(stack, temp);
        }
    }
    public static void sortInsert(Stack<Integer> stack, int x) {
        if(stack.isEmpty() || stack.peek() < x){
            stack.push(x);
            return;
        }
        int temp = stack.pop();
        sortInsert(stack, x);
        stack.push(temp);
    }
    public static void displayStack(Stack<Integer> stack){
        for(Integer element : stack){
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
