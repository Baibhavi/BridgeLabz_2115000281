package Day4.Level1;
import java.util.Scanner;
public class MeanHeight {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double heights[] = new double[11];
        double sum = 0;
        System.out.println("Enter height of 11 players of football team:");
        for(int i = 0; i < 11; i++){
            heights[i] = input.nextDouble();
            sum += heights[i];
        }
        double mean = sum/11;
        System.out.println("The mean height of football team is " + mean);
    }
}
