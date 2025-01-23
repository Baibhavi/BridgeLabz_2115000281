package Day3.Level2;

import java.util.Scanner;
public class LeapYear2 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int year = input.nextInt();
            if(year >= 1582){
                if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
                    System.out.println(year + " is a Leap year");
                }
                else{
                    System.out.println(year + " is not a Leap year");
                }
            }
            input.close();
        }
}
