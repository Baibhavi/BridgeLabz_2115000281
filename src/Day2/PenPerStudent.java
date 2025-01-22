package Day2;

public class PenPerStudent {
    public static void main(String[] args) {
        int totalPen = 14;
        int totalStudents = 3;
        int numberOfPenPerStudent = totalPen/totalStudents;
        int nondistributedPens = totalPen%totalStudents;
        System.out.println("The Pen Per Student is " + numberOfPenPerStudent + " and the remaining pen not distributed is " + nondistributedPens);
    }
}
