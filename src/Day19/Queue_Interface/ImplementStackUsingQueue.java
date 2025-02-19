package Day19.Queue_Interface;

import java.util.LinkedList;
import java.util.Queue;
class StackWithQueue{
    Queue<Integer> queue1 = new LinkedList<>();
    Queue<Integer> queue2 = new LinkedList<>();
    public void push(int q){
        queue2.add(q);
        while(!queue1.isEmpty()){
            queue2.add(queue1.remove());
        }
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;
    }
    public int pop(){
        if (queue1.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return queue1.remove();
    }
    public int top() {
        if (queue1.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return queue1.peek();
    }
    public boolean isEmpty() {
        return queue1.isEmpty();
    }
}
public class ImplementStackUsingQueue {
    public static void main(String[] args) {
        StackWithQueue stack = new StackWithQueue();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.pop());
        System.out.println(stack.top());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
