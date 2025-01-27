package Day5.Level1;
import java.util.Scanner;
public class SpringSeason {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int month = input.nextInt();
        int day = input.nextInt();
        springChecker(month, day);
        input.close();
    }
    public static void springChecker(int month, int day){
        if((month == 3 && day >= 20) || (month == 6 && day <= 20) || month == 4 || month == 5)
            System.out.println("Its a Spring Season");
        else
            System.out.println("Not a Spring Season");
    }
}
