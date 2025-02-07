package Day11.HierarchicalInheritance;
class Person {
    private String name;
    private int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
class Teacher extends Person {
    private String subject;
    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }
    public void displayRole() {
        System.out.println("Role: Teacher");
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Subject: " + subject);
    }
}class Student extends Person {
    private int grade;
    public Student(String name, int age, int grade) {
        super(name, age);
        this.grade = grade;
    }
    public void displayRole() {
        System.out.println("Role: Student");
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Grade: " + grade);
    }
}
class Staff extends Person {
    private String position;
    public Staff(String name, int age, String position) {
        super(name, age);
        this.position = position;
    }
    public void displayRole() {
        System.out.println("Role: Staff");
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Position: " + position);
    }
}
public class SchoolSystem {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Alice", 30, "Mathematics");
        Student student = new Student("Bob", 15, 10);
        Staff staff = new Staff("Charlie", 45, "Janitor");
        teacher.displayRole();
        teacher.displayInfo();
        System.out.println();
        student.displayRole();
        student.displayInfo();
        System.out.println();
        staff.displayRole();
        staff.displayInfo();
    }
}
