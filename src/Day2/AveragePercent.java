package Day2;

public class AveragePercent {
    public static void main(String[] args) {
        int mathsMark = 94;
        int physicsMark = 95;
        int chemistryMark = 96;
        double totalMarks = 300;
        double totalMarksObtained = mathsMark+physicsMark+chemistryMark;
        double average = totalMarksObtained/totalMarks;
        double averagePercent = average*100;
        System.out.println("Sam's average mark in PCM is " + averagePercent);

    }
}
