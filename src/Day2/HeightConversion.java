package Day2;

import java.util.Scanner;
public class HeightConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double heightCm = input.nextInt();
        double heightInches = heightCm/2.54;
        double heightFeet = heightInches/12;
        System.out.println("Your Height in cm is " + heightCm + " while in feet is " + heightFeet + " and inches is " + heightInches);
    }
}
