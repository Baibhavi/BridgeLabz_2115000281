package Day19.List_Interface;

import java.util.ArrayList;
import java.util.List;
public class RotateElementsInList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for(int i = 10; i <=50; i+=10){
            list.add(i);
        }
        int rotationNum = 2;
        rotateElements(list, rotationNum);
        System.out.println(list);
    }
    public static void rotateElements(List<Integer> list, int rotationNum){
        int count = 0;
        while(count < rotationNum){
            int temp = list.remove(0);
            list.add(temp);
            count++;
        }
    }
}
