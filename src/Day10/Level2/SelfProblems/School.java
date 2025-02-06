package Day10.Level2.SelfProblems;

import java.util.ArrayList;
import java.util.List;
public class School {
    private String name;
    private List<Student> students;
    public School(String name){
        this.name = name;
        this.students = new ArrayList<>();
    }
    public void addStudent(Student student){
        students.add(student);
    }
    public String getName(){
        return name;
    }
    public List<Student> getStudents(){
        return students;
    }

    public static void main(String[] args) {
        School school = new School("Delhi Public School");
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");
        school.addStudent(student1);
        school.addStudent(student2);
        Course course1 = new Course("Maths");
        Course course2 = new Course("Science");
        student1.enrollInCourse(course1);
        student1.enrollInCourse(course2);
        student2.enrollInCourse(course1);
        System.out.print("Courses for " + student1.getName() + ": ");
        for(Course course : student1.getCourses()){
            System.out.print(course.getName() + " ");
        }
        System.out.print("\nCourses for " + student2.getName() + ": ");
        for(Course course : student2.getCourses()){
            System.out.print(course.getName()+ " ");
        }
        System.out.print("\nStudents in " + course1.getName() + ": ");
        for(Student student : course1.getStudents()){
            System.out.print(student.getName()+ " ");
        }
        System.out.print("\nStudents in " + course2.getName() + ": ");
        for(Student student : course2.getStudents()){
            System.out.print(student.getName()+ " ");
        }
    }
}
class Student{
    private String name;
    private List<Course> courses;
    public Student(String name){
        this.name = name;
        this.courses = new ArrayList<>();
    }
    public void enrollInCourse(Course course){
        courses.add(course);
        course.addStudents(this);
    }
    public String getName(){
        return name;
    }
    public List<Course> getCourses(){
        return courses;
    }
}
class Course{
    private String name;
    private List<Student> students;
    public Course(String name){
        this.name = name;
        this.students = new ArrayList<>();
    }
    public String getName(){
        return name;
    }
    public void addStudents(Student student){
        students.add(student);
    }
    public List<Student> getStudents(){
        return students;
    }
}
