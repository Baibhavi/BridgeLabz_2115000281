package Day13.SinglyLinkedList;
class Student{
    int rollNumber;
    String name;
    int age;
    char grade;
    Student next;
    public Student(int rollNumber, String name, int age, char grade){
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.next = null;
    }
}
public class StudentRecordManagement {
    Student head;
    public StudentRecordManagement(){
        this.head = null;
    }
    public void addAtBeginning(int roll, String name, int age, char grade){
        Student newStudent = new Student(roll, name, age, grade);
        newStudent.next = head;
        head = newStudent;
    }
    public void addAtEnd(int roll, String name, int age, char grade){
        Student newStudent = new Student(roll, name, age, grade);
        if(head == null){
            head = newStudent;
        }else{
            Student temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newStudent;
        }
    }
    public void addAtPosition(int position, int roll, String name, int age, char grade){
        if(position < 1){
            System.out.println("Invalid Position");
        }
        if(position == 1){
            addAtBeginning(roll, name, age, grade);
            return;
        }
        Student newStudent = new Student(roll, name, age, grade);
        Student temp = head;
        for(int i = 1; i < position-1 && temp != null ; i++){
            temp = temp.next;
        }
        if(temp == null){
            System.out.println("Out of range");
        }
        newStudent.next = temp.next;
        temp.next = newStudent;
    }
    public void deleteStudentByRollNumber(int roll){
        if(head == null){
            System.out.println("Empty LinkedList");
            return;
        }
        if(head.rollNumber == roll){
            head = head.next;
            return;
        }
        Student temp = head;
        Student prev = null;
        while(temp != null & temp.rollNumber != roll){
            prev = temp;
            temp = temp.next;
        }
        if(temp == null){
            System.out.println("Student not found");
            return;
        }
        prev.next = temp.next;
    }
    public void searchStudent(int roll){
        Student temp = head;
        while(temp != null){
            if(temp.rollNumber == roll){
                 System.out.println("Name: " + temp.name + "  Roll Number: " + temp.rollNumber + "  Age: " + temp.age + "  Grade: " + temp.grade);
                 return;
            }
            temp = temp.next;
        }
        System.out.println("Student not found!");
    }
    public void displayRecords(){
        Student temp = head;
        while(temp != null){
            System.out.println("Name: " + temp.name + "  Roll Number: " + temp.rollNumber + "  Age: " + temp.age + "  Grade: " + temp.grade);
            temp = temp.next;
        }
    }
    public void updateStudentGrade(int roll, char newGrade){
        Student temp = head;
        while(temp != null){
            if(temp.rollNumber == roll){
                temp.grade = newGrade;
                System.out.println("Grade updated for Roll Number: " + temp.rollNumber);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student not found");
    }
    public static void main(String[] args) {
        StudentRecordManagement student = new StudentRecordManagement();
        student.addAtBeginning(1, "John", 18, 'A');
        student.addAtEnd(2, "Alice", 19, 'B');
        student.addAtPosition(2, 3, "Bob", 20, 'C');
        System.out.println("All Students:");
        student.displayRecords();
        System.out.println("Searching for student with roll number 2");
        student.searchStudent(2);
        System.out.println("Updating grade for roll number 2");
        student.updateStudentGrade(2, 'A');
        System.out.println("All Students after update");
        student.displayRecords();
        System.out.println("Deleting student with roll number 1");
        student.deleteStudentByRollNumber(1);
        System.out.println("All Students after deletion:");
        student.displayRecords();
    }
}
