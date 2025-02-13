package Day14.StackAndQueue;

import java.util.Stack;
public class QueueUsingStacks {
    Stack<Integer> stack1;
    Stack<Integer> stack2;
    public QueueUsingStacks(){
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }
    public void enqeue(int x){
        stack1.push(x);
    }
    public int deqeue(){
        if(stack2.isEmpty()){
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }
    public static void main(String[] args) {
        QueueUsingStacks queue = new QueueUsingStacks();
        queue.enqeue(1);
        queue.enqeue(2);
        queue.enqeue(3);
        System.out.println(queue.deqeue());
        System.out.println(queue.deqeue());
        System.out.println(queue.deqeue());
    }
}
