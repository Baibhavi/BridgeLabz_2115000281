package Day5.Level2;

import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the year : ");
        int year = input.nextInt();
        if(year >= 1582){
            leapOrNot(year);
        }
    }
    public static void leapOrNot(int year){
        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            System.out.println("Leap year");
        }
        else{
            System.out.println("Not a leap year");
        }
    }
}
