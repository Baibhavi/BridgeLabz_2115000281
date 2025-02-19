package Day19.Queue_Interface;

import java.util.Arrays;
class CircularBuffer{
    private int[] buffer;
    private int head, tail, size, capacity;
    public CircularBuffer(int capacity){
        this.capacity = capacity;
        buffer = new int[capacity];
        head = 0;
        tail = 0;
        size = 0;
    }
    public void insert(int x){
        buffer[tail] = x;
        tail = (tail + 1)%capacity;
        if(size < capacity){
            size++;
        }
        else {
            head = (head + 1)%capacity;
        }
    }
    public int[] getBuffer(){
        int[] result = new int[size];
        for (int i = 0; i < size; i++){
            result[i] = buffer[(head+i)%capacity];
        }
        return result;
    }
}
public class CalculateBufferSimulation {
    public static void main(String[] args) {
        CircularBuffer circularBuffer = new CircularBuffer(3);
        circularBuffer.insert(1);
        circularBuffer.insert(2);
        circularBuffer.insert(3);
        System.out.println("Buffer: " + Arrays.toString(circularBuffer.getBuffer()));
        circularBuffer.insert(4);
        System.out.println("Buffer: " + Arrays.toString(circularBuffer.getBuffer()));
        circularBuffer.insert(5);
        System.out.println("Buffer: " + Arrays.toString(circularBuffer.getBuffer()));
    }
}
