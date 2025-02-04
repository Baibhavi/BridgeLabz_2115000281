package Day9.Level1;

public class Student {
    private static String universityName = "GLA University";
    private static int totalStudents = 0;
    private String name;
    private final long rollNumber;
    private String grade;
    public Student(String name, long rollNumber, String grade){
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }
    public static void displayTotalStudents(){
        System.out.println("Total Students : " + totalStudents);
    }
    public void displayStudentDetails(){
        if(this instanceof Student){
            System.out.println(universityName);
            System.out.println("Student Name : " + this.name);
            System.out.println("Roll Number : " + this.rollNumber);
            System.out.println("Grade : " + this.grade);
            System.out.print("\n-----------------------------------------------------------------------------------------------\n");
        }
        else{
            System.out.println("Invalid Request");
        }
    }

    public static void main(String[] args) {
        Student student1 = new Student("Baibhavi", 2115000281, "A");
        Student student2 = new Student("Pooja", 2115000675, "A");
        student1.displayStudentDetails();
        student2.displayStudentDetails();
        displayTotalStudents();
    }
}
