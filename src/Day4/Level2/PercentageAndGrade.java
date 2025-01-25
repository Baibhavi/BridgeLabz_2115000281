package Day4.Level2;

import java.util.Scanner;
public class PercentageAndGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of students:");
        int numOfStudents = input.nextInt();
        int[] totalMarks = new int[numOfStudents];
        for(int i = 0; i < numOfStudents;i++){
            int physics = 0, chemistry = 0, maths=0;
            do{
                System.out.println("Enter the marks of physics for student " + (i+1));
                physics = input.nextInt();
                if(physics < 0){
                    System.out.println("Marks cannot be negative, enter again!");
                }
            }while(physics < 0);
            do{
                System.out.println("Enter the marks of chemistry for student " + (i+1));
                chemistry = input.nextInt();
                if(chemistry < 0){
                    System.out.println("Marks cannot be negative, enter again!");
                }
            }while(chemistry <= 0);
            do{
                System.out.println("Enter the marks of maths for student " + (i+1));
                maths = input.nextInt();
                if(maths < 0){
                    System.out.println("Marks cannot be negative, enter again!");
                }
            }while(maths <= 0);
            totalMarks[i] = physics+chemistry+maths;
        }
        int[] percent = new int[numOfStudents];
        String[] grade = new String[numOfStudents];
        for(int i = 0; i < numOfStudents; i++){
            percent[i] = totalMarks[i] / 3;
            if(percent[i] >= 80){
                grade[i] = "A";
            }
            else if(percent[i] < 80 && percent[i] >=70){
                grade[i] = "B";
            }
            else if(percent[i] < 70 && percent[i] >=60){
                grade[i] = "C";
            }
            else if(percent[i] < 60 && percent[i] >=50){
                grade[i] = "D";
            }
            else if(percent[i] < 50 && percent[i] >=40){
                grade[i] = "E";
            }
            else{
                grade[i] = "R";
            }
        }
        for(int i = 0; i < numOfStudents; i++){
            System.out.println("For student " + (i+1) + ", Total Marks = " + totalMarks[i] + ", Percentage = " + percent[i] + ", Grade = "+grade[i]);
        }
    }
}
