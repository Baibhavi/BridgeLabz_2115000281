package Day10.Level2.SelfProblems;
import java.util.ArrayList;
import java.util.List;
public class UniversityManagementSystem {
    public static void main(String[] args) {
        Students student1 = new Students("Baibhavi");
        Students student2 = new Students("Pooja");
        Professor professor1 = new Professor("Dr. Praveen Mittal");
        Professor professor2 = new Professor("Dr. Praphul Jain");
        Courses course1 = new Courses("Mathematics");
        Courses course2 = new Courses("Physics");
        student1.enrollCourse(course1);
        student1.enrollCourse(course2);
        student2.enrollCourse(course1);
        professor1.assignCourse(course1);
        professor2.assignCourse(course2);
        System.out.println("Courses for " + student1.getName());
        for (Courses course : student1.getCourses()) {
            System.out.println("  Course: " + course.getName() + ", Professor: " + (course.getProfessor() != null ? course.getProfessor().getName() : "None"));
        }
        System.out.println("Courses for " + student2.getName());
        for (Courses course : student2.getCourses()) {
            System.out.println("  Course: " + course.getName() + ", Professor: " + (course.getProfessor() != null ? course.getProfessor().getName() : "None"));
        }
        System.out.println("Courses taught by " + professor1.getName());
        for (Courses course : professor1.getCourses()) {
            System.out.println("  Course: " + course.getName());
        }
        System.out.println("Courses taught by " + professor2.getName());
        for (Courses course : professor2.getCourses()) {
            System.out.println("  Course: " + course.getName());
        }
    }

}
class Courses {
    private String name;
    private Professor professor;
    private List<Students> students;
    public Courses(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }
    public String getName() {
        return name;
    }
    public void assignProfessor(Professor professor) {
        this.professor = professor;
    }
    public void addStudent(Students student) {
        students.add(student);
    }
    public List<Students> getStudents() {
        return students;
    }
    public Professor getProfessor() {
        return professor;
    }
}
class Students {
    private String name;
    private List<Courses> courses;
    public Students(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }
    public String getName() {
        return name;
    }
    public void enrollCourse(Courses course) {
        courses.add(course);
        course.addStudent(this);
    }
    public List<Courses> getCourses() {
        return courses;
    }
}
class Professor {
    private String name;
    private List<Courses> courses;
    public Professor(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }
    public String getName() {
        return name;
    }
    public void assignCourse(Courses course) {
        courses.add(course);
        course.assignProfessor(this);
    }
    public List<Courses> getCourses() {
        return courses;
    }
}

