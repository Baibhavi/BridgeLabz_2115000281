package Day19.Queue_Interface;

import java.util.LinkedList;
import java.util.Queue;
public class GenerateBinaryNumbers {
    public static void main(String[] args) {
        int n = 5;
        Queue<String> queue = generateBinaryNumbers(n);
        System.out.println(queue);
    }
    public static Queue<String> generateBinaryNumbers(int n){
        Queue<String> result = new LinkedList<>();
        Queue<String> queue = new LinkedList<>();
        queue.add("1");
        for(int i = 0; i < n; i++){
            String current = queue.remove();
            result.add(current);
            String next1 = current + "0";
            String next2 = current + "1";
            queue.add(next1);
            queue.add(next2);
        }
        return result;
    }
}
