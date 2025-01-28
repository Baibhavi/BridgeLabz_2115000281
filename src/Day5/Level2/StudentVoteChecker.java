package Day5.Level2;

import java.util.Scanner;
public class StudentVoteChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter age of 10 students : ");
        int[] age = new int[10];
        for(int i = 0; i < 10; i++){
            age[i] = input.nextInt();
        }
        for(int i = 0; i < 10; i++){
            StudentVoteChecker obj = new StudentVoteChecker();
            boolean result = obj.canStudentVote(age[i]);
            if(result == true){
                System.out.println("Student " + (i+1) +" with age " + age[i] + " can Vote.");
            }
            else{
                System.out.println("Student " + (i+1) +" with age " + age[i] + " cannot Vote.");
            }
        }
    }
    public boolean canStudentVote(int age){
        if(age >= 18){
            return true;
        }
        return false;
    }
}
