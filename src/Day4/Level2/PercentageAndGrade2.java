package Day4.Level2;
import java.util.Scanner;
public class PercentageAndGrade2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of students:");
        int numOfStudents = input.nextInt();

        double[][] marks = new double[numOfStudents][3];
        String[] grades = new String[numOfStudents];

        for(int i = 0; i < numOfStudents; i++){
            for(int j = 0; j < 3; j++){
                if(j == 0) {
                    do {
                        System.out.println("Enter the marks of physics for student " + (i+1));
                        marks[i][j] = input.nextDouble();
                        if(marks[i][j] < 0) {
                            System.out.println("Marks cannot be negative, enter again!");
                        }
                    } while(marks[i][j] < 0);
                } else if(j == 1) {
                    do {
                        System.out.println("Enter the marks of chemistry for student " + (i+1));
                        marks[i][j] = input.nextDouble();
                        if(marks[i][j] < 0) {
                            System.out.println("Marks cannot be negative, enter again!");
                        }
                    } while(marks[i][j] < 0);
                } else {
                    do {
                        System.out.println("Enter the marks of maths for student " + (i+1));
                        marks[i][j] = input.nextDouble();
                        if(marks[i][j] < 0) {
                            System.out.println("Marks cannot be negative, enter again!");
                        }
                    } while(marks[i][j] < 0);
                }
            }
        }

        double[] percent = new double[numOfStudents];

        for(int i = 0; i < numOfStudents; i++) {
            double totalMarks = marks[i][0] + marks[i][1] + marks[i][2];
            percent[i] = totalMarks / 3;

            if(percent[i] >= 80){
                grades[i] = "A";
            } else if(percent[i] < 80 && percent[i] >= 70){
                grades[i] = "B";
            } else if(percent[i] < 70 && percent[i] >= 60){
                grades[i] = "C";
            } else if(percent[i] < 60 && percent[i] >= 50){
                grades[i] = "D";
            } else if(percent[i] < 50 && percent[i] >= 40){
                grades[i] = "E";
            } else {
                grades[i] = "R";
            }
        }

        for(int i = 0; i < numOfStudents; i++) {
            System.out.println("For student " + (i+1) + ", Physics Marks = " + marks[i][0] + ", Chemistry Marks = " + marks[i][1] + ", Maths Marks = " + marks[i][2] + ", Percentage = " + percent[i] + ", Grade = " + grades[i]);
        }
    }
}

