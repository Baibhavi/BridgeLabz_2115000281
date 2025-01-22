package Day2;
import java.util.Scanner;
public class MaximunHandshakes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOfStudents = input.nextInt();
        int maxHandshake = (numberOfStudents*(numberOfStudents-1))/2;
        System.out.println("The maximum number of handshakes is " + maxHandshake + " for "+numberOfStudents+ " students");
    }
}
