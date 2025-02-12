package Day13.CircularLinkedList;
class Task{
    int taskId;
    String taskName;
    int priority;
    String dueDate;
    Task next;
    public Task(int taskId, String taskName, int priority, String dueDate) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.priority = priority;
        this.dueDate = dueDate;
        this.next = null;
    }
}
class TaskScheduler{
    Task head, tail;
    public TaskScheduler(){
        this.head = null;
        this.tail = null;
    }
    public void addAtBeginning(int taskId, String taskName, int priority, String dueDate){
        Task newTask = new Task(taskId, taskName, priority, dueDate);
        if(head == null){
            head = tail = newTask;
        }
        else{
            newTask.next = head;
            head = newTask;
        }
    }
    public void addAtEnd(int taskId, String taskName, int priority, String dueDate){
        Task newTask = new Task(taskId, taskName, priority, dueDate);
        if(head == null){
            head = tail = newTask;
        }
        else{
            tail.next = newTask;
            newTask.next = head;
            tail = newTask;
        }
    }
    public void addAtPosition(int position, int taskId, String taskName, int priority, String dueDate){
        if(position < 1){
            System.out.println("Invalid Position");
            return;
        }
        if(position == 1){
            addAtBeginning(taskId, taskName, priority, dueDate);
            return;
        }
        Task newTask = new Task(taskId, taskName, priority, dueDate);
        Task temp = head;
        for(int i = 1; i < position-1 && temp != null; i++){
            temp = temp.next;
        }
        if(temp == null){
            System.out.println("Out of range");
            return;
        }
        if(temp.next == head){
            temp.next = newTask;
            tail = newTask;
            tail.next = head;
        }
        else{
            newTask.next = temp.next;
            temp.next = newTask;
        }
    }
    public void removeTaskByID(int taskId){
        if(head == null){
            System.out.println("Empty LinkedList");
            return;
        }
        if(head.taskId == taskId){
            if(head.next == head){
                head = null;
            }
            else{
                Task temp = head;
                temp.next = head.next;
                head = head.next;
            }
        }
        Task prev = null;
        Task temp = head;
        do{
            if(temp.taskId == taskId){
                prev.next = temp.next;
                return;
            }
            prev = temp;
            temp = temp.next;
        }while(temp != head);
        System.out.println("Task ID not found");
    }
    public void displayTask(){
        if(head == null){
            System.out.println("Empty Linked List");
            return;
        }
        Task temp = head;
        do{
            System.out.println("ID: " + temp.taskId + "\nName: " + temp.taskName + "\nPriority: " + temp.priority + "\nDue Date: " + temp.dueDate);
            System.out.println();
            temp = temp.next;
        }while(temp != head);
    }
    public void viewCurrentTask(){
        if(head == null){
            System.out.println("Empty Linked List");
            return;
        }
        System.out.println("ID: " + head.taskId + "\nName: " + head.taskName + "\nPriority: " + head.priority + "\nDue Date: " + head.dueDate);
        System.out.println();
        head = head.next;
    }
    public void searchByPriority(int priority){
        if(head == null){
            System.out.println("Empty Linked List");
            return;
        }
        Task temp = head;
        do{
            if(temp.priority == priority) {
                System.out.println("ID: " + temp.taskId + "\nName: " + temp.taskName + "\nPriority: " + temp.priority + "\nDue Date: " + temp.dueDate);
                System.out.println();
                return;
            }
            temp = temp.next;
        }while(temp != head);
        System.out.println("Task Not Found");
    }
}
public class TaskSchedulerApp {
    public static void main(String[] args) {
        TaskScheduler task = new TaskScheduler();
        task.addAtBeginning(1, "Coding", 1, "21/2/25");
        task.addAtEnd(3, "Meeting", 2, "3/3/25");
        task.addAtPosition(2,2, "Presentation", 3, "15/3/25");
        task.addAtEnd(4, "Brainstorming", 4, "13/3/25");
        task.displayTask();
        task.removeTaskByID(3);
        task.displayTask();
        System.out.println("Current task:- ");
        task.viewCurrentTask();
        task.displayTask();
        task.searchByPriority(3);
    }
}
