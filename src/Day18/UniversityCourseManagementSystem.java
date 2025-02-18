package Day18;

import java.util.ArrayList;
import java.util.List;
abstract class CourseType{
    private String courseName;
    private String instructor;
    public CourseType(String courseName, String instructor){
        this.courseName = courseName;
        this.instructor = instructor;
    }
    public String getCourseName(){
        return courseName;
    }
    public String getInstructor(){
        return instructor;
    }
    public String toString() {
        return "Course: " + courseName + ", Instructor: " + instructor;
    }
}
class ExamCourse extends CourseType {
    private int examDuration;
    public ExamCourse(String courseName, String instructor, int examDuration) {
        super(courseName, instructor);
        this.examDuration = examDuration;
    }
    public int getExamDuration() {
        return examDuration;
    }
    public String toString() {
        return super.toString() + ", Exam Duration: " + examDuration + " minutes";
    }
}
class AssignmentCourse extends CourseType {
    private int numberOfAssignments;
    public AssignmentCourse(String courseName, String instructor, int numberOfAssignments) {
        super(courseName, instructor);
        this.numberOfAssignments = numberOfAssignments;
    }
    public int getNumberOfAssignments() {
        return numberOfAssignments;
    }
    public String toString() {
        return super.toString() + ", Number of Assignments: " + numberOfAssignments;
    }
}
class ResearchCourse extends CourseType {
    private String researchTopic;
    public ResearchCourse(String courseName, String instructor, String researchTopic) {
        super(courseName, instructor);
        this.researchTopic = researchTopic;
    }
    public String getResearchTopic() {
        return researchTopic;
    }
    public String toString() {
        return super.toString() + ", Research Topic: " + researchTopic;
    }
}
class Course<T extends CourseType>{
    private List<T> courses;
    public Course(){
        this.courses = new ArrayList<>();
    }
    public void addCourse(T course){
        courses.add(course);
    }
    public void removeCourse(T course){
        courses.remove(course);
    }
    public T getCourse(int index){
        return courses.get(index);
    }
    public List<T> getAllCourses(){
        return courses;
    }
    public void displayCourses(List<? extends CourseType> courses) {
        for(CourseType course: courses){
            System.out.println(course);
        }
    }
}
public class UniversityCourseManagementSystem {
    public static void main(String[] args) {
        Course<ExamCourse> examCourses = new Course<>();
        Course<AssignmentCourse> assignmentCourses = new Course<>();
        Course<ResearchCourse> researchCourses = new Course<>();
        ExamCourse mathsExamCourse = new ExamCourse("Mathematics", "Dr. A", 120);
        AssignmentCourse historyAssignmentCourse = new AssignmentCourse("History", "Prof. B", 5);
        ResearchCourse physicsResearchCourse = new ResearchCourse("Physics", "Dr. C", "Quantum Mechanics");
        examCourses.addCourse(mathsExamCourse);
        assignmentCourses.addCourse(historyAssignmentCourse);
        researchCourses.addCourse(physicsResearchCourse);
        System.out.println("Exam Courses:");
        examCourses.displayCourses(examCourses.getAllCourses());
        System.out.println("Assignment Courses:");
        assignmentCourses.displayCourses(assignmentCourses.getAllCourses());
        System.out.println("Research Courses:");
        researchCourses.displayCourses(researchCourses.getAllCourses());
    }
}
