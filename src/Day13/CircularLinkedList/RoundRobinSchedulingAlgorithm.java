package Day13.CircularLinkedList;
class Process{
    int id, priority;
    float burstTime;
    Process next;
    public Process(int id, int priority, float burstTime){
        this.id = id;
        this.priority = priority;
        this.burstTime = burstTime;
        this.next = null;
    }
}
class  RoundRobin{
    Process head, tail;
    public RoundRobin(){
        this.head = null;
        this.tail = null;
    }
    public void addProcess(int id, int priority, float burstTime){
        Process newProcess = new Process(id, priority, burstTime);
        if(head == null){
            head = tail = newProcess;
        }
        else{
            tail.next = newProcess;
            tail = newProcess;
            tail.next = head;
        }
    }
    public void removeProcess(int id){
        if(head == null){
            System.out.println("Empty List");
            return;
        }
        if(head.id == id){
            if(head == tail){
                head= tail = null;
            }
            else{
                head = head.next;
                tail.next = head;
            }
        }
        Process temp = head, prev = null;
        do{
            if(temp.id == id){
                prev.next = temp.next;
                if(temp == tail){
                    tail = prev;
                }
                return;
            }
            prev = temp;
            temp = temp.next;
        }while(temp != head);
        System.out.println("Process ID not found");
    }
    public void displayProcesses() {
        if (head == null) {
            System.out.println("Empty List");
            return;
        }
        Process temp = head;
        do {
            System.out.println("Process ID: " + temp.id + ", Priority: " + temp.priority + ", Burst Time: " + temp.burstTime);
            temp = temp.next;
        } while (temp != head);
    }
    public void calculateAndDisplayTimes(float totalBurstTime){
        if (head == null) {
            System.out.println("No processes to schedule");
            return;
        }
        int processCount = 0;
        float totalWaitTime = 0;
        float totalTurnAroundTime = 0;
        Process temp = head;
        do{
            float waitTime = totalBurstTime -temp.burstTime;
            float turnAroundTime = waitTime + temp.burstTime;
            totalWaitTime += waitTime;
            totalTurnAroundTime += turnAroundTime;
            processCount++;
            temp = temp.next;
        }while(temp != head);
        float avgWaitTime = totalWaitTime/processCount;
        float avgTurnAroundTime = totalTurnAroundTime/processCount;
        System.out.println("Average Waiting Time: " + avgWaitTime);
        System.out.println("Average Turn-Around Time: " + avgTurnAroundTime);
    }
    public void simulateRoundRobin(float timeQuantum){
        if (head == null) {
            System.out.println("No processes to schedule");
            return;
        }
        Process temp = head;
        do{
            if(temp.burstTime > 0){
                float timeSpent = Math.min(timeQuantum, temp.burstTime);
                temp.burstTime -= timeSpent;
                System.out.println("Process ID: " + temp.id + " executed for " + timeSpent + " units.");
                if(temp.burstTime == 0){
                    System.out.println("Process ID: " + temp.id + " has finished execution.");
                    removeProcess(temp.id);
                }
            }
            temp = temp.next;
        }while(temp != head);
    }

}
public class RoundRobinSchedulingAlgorithm {
    public static void main(String[] args) {
        RoundRobin scheduler = new RoundRobin();
        scheduler.addProcess(1, 2, 10);
        scheduler.addProcess(2, 1, 5);
        scheduler.addProcess(3, 3, 8);
        float timeQuantum = 3;
        scheduler.simulateRoundRobin(timeQuantum);
        scheduler.displayProcesses();
        scheduler.calculateAndDisplayTimes(23);
        scheduler.simulateRoundRobin(timeQuantum);
        scheduler.displayProcesses();
    }
}
