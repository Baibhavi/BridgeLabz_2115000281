package Day8.AccessModifier;

public class Student {
    public int rollNumber;
    protected String name;
    private double CGPA;
    public Student() {
        this.rollNumber = 0;
        this.name = "Unknown";
        this.CGPA = 0;
    }
    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }
    public void setCGPA(double CGPA){
        this.CGPA = CGPA;
    }
    public double getCGPA(){
        return CGPA;
    }
    public static void main(String[] args) {
        PostgraduateStudent student = new PostgraduateStudent(101, "John Doe", 8.5, "AI in Education");
        student.displayInfo();
        student.setCGPA(9.2);
        System.out.println("Updated CGPA: " + student.getCGPA());
    }
}
class PostgraduateStudent extends Student{
    private String thesisTitle;
    public PostgraduateStudent(int rollNumber, String name, double CGPA, String thesisTitle) {
        super(rollNumber, name, CGPA);
        this.thesisTitle = thesisTitle;
    }
    public void displayInfo() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + getCGPA());
        System.out.println("Thesis Title: " + thesisTitle);
    }
}