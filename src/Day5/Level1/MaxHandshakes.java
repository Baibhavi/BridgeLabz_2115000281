package Day5.Level1;

import java.util.Scanner;

public class MaxHandshakes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of students:");
        int numOfStudents = input.nextInt();
        MaxHandshakes obj = new MaxHandshakes();
        int numOfHandshakes = obj.handshakes(numOfStudents);
        System.out.println("Maximum Handshakes is " + numOfHandshakes+" for " + numOfStudents + " students." );
    }
    public int handshakes(int n){
        return n*(n-1)/2;
    }
}
