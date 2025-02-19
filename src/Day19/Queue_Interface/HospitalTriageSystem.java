package Day19.Queue_Interface;

import java.util.PriorityQueue;
class Patient {
    private String name;
    int priority;
    public Patient(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }
    @Override
    public String toString() {
        return name + " (Priority: " + priority + ")";
    }
}
public class HospitalTriageSystem {
    public static void main(String[] args) {
        PriorityQueue<Patient> triageQueue = new PriorityQueue<>((p1, p2) -> Integer.compare(p1.priority, p2.priority));
        triageQueue.add(new Patient("Pooja", 3));
        triageQueue.add(new Patient("Divya", 5));
        triageQueue.add(new Patient("Krishna", 2));
        System.out.println("Order of treatment:");
        while (!triageQueue.isEmpty()) {
            System.out.println(triageQueue.poll());
        }
    }
}
