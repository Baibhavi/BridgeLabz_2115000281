package Day19.List_Interface;
class Node {
    String value;
    Node next;

    Node(String value) {
        this.value = value;
        this.next = null;
    }
}
public class NthElementFromEnd {
    public static void main(String[] args) {
        Node head = new Node("A");
        head.next = new Node("B");
        head.next.next = new Node("C");
        head.next.next.next = new Node("D");
        head.next.next.next.next = new Node("E");
        int N = 2;
        Node result = findNthFromEnd(head, N);
        System.out.println(result != null ? result.value : "Not found");
    }
    public static Node findNthFromEnd(Node head, int N){
        if(head == null || N <= 0){
            return null;
        }
        Node slow = head, fast = head;
        for(int i = 0; i < N; i++){
            if(fast == null){
                return null;
            }
            fast = fast.next;
        }
        while(fast != null){
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
}
