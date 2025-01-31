package Day8.VariableMethods;
public class Course {
    private String courseName;
    private int duration;
    private double fee;
    private static String instituteName = "Default Institute";

    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    public void displayCourseDetails() {
        System.out.println("Institute Name: " + instituteName);
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " weeks");
        System.out.println("Fee: $" + fee);
    }

    public static void updateInstituteName(String newInstituteName) {
        instituteName = newInstituteName;
    }

    public static void main(String[] args) {
        Course.updateInstituteName("Tech Academy");

        Course course1 = new Course("Java Programming", 12, 500.0);
        Course course2 = new Course("Web Development", 10, 400.0);

        course1.displayCourseDetails();
        course2.displayCourseDetails();
    }
}
