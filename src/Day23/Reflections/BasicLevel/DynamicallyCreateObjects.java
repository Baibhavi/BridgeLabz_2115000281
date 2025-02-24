package Day23.Reflections.BasicLevel;
class Student {
    private String name;
    private int rollNo;
    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }
    public void display() {
        System.out.println("Name: " + name + ", Roll No: " + rollNo);
    }
}
public class DynamicallyCreateObjects {
    public static void main(String[] args) {
        try{
            Class<?> studentClass = Class.forName("Day23.Reflections.BasicLevel.Student");
            Object student = studentClass.getDeclaredConstructor(String.class, int.class).newInstance("Baibhavi", 101);
            Student studentInstance = (Student) student;
            studentInstance.display();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
