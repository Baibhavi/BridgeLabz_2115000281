package Day3.Level1;
import java.util.Scanner;
public class BonusOfEmployees {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your salary and year of service rrespectively: ");
        float salary = input.nextFloat();
        float yearOfService = input.nextFloat();
        float bonus = 0;
        if(yearOfService > 5){
            bonus = salary * 5 / 100;
        }
        System.out.println("The bonus for " + yearOfService + " years of service is " + bonus);
    }
}
