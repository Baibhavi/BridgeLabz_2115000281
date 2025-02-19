package Day19.List_Interface;

import java.util.ArrayList;
import java.util.LinkedList;
public class ReverseList {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i = 1; i <= 5; i++){
            arrayList.add(i);
        }
        LinkedList<Integer> linkedList = new LinkedList<>();
        for(int i = 1; i <= 5; i++){
            linkedList.add(i);
        }
        System.out.println("List before reversing: " + arrayList);
        reverseArrayList(arrayList);
        System.out.println("Reversed ArrayList: " + arrayList);
        reverseLinkedList(linkedList);
        System.out.println("Reversed LinkedList: " + linkedList);
    }
    public static void reverseArrayList(ArrayList<Integer> ar){
        int left = 0, right = ar.size()-1;
        while(left < right){
            int temp = ar.get(left);
            ar.set(left, ar.get(right));
            ar.set(right, temp);
            left++;
            right--;
        }
    }
    public static void reverseLinkedList(LinkedList<Integer> ll){
        int left = 0, right = ll.size()-1;
        while(left < right){
            int temp = ll.get(left);
            ll.set(left, ll.get(right));
            ll.set(right, temp);
            left++;
            right--;
        }
    }
}
