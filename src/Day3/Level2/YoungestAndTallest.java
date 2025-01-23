package Day3.Level2;
import java.util.Scanner;
public class YoungestAndTallest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter age of Amar, Akbar and Anthony respectively: ");
        int ageAmar = input.nextInt();
        int ageAkbar = input.nextInt();
        int ageAnthony = input.nextInt();
        System.out.println("Enter height of Amar, Akbar and Anthony respectively: ");
        float heightAmar = input.nextFloat();
        float heightAkbar = input.nextFloat();
        float heightAnthony = input.nextFloat();
        if(ageAmar < ageAkbar && ageAmar < ageAnthony){
            System.out.println("Amar is youngest");
        }
        else if(ageAkbar < ageAmar && ageAkbar < ageAnthony){
            System.out.println("Akbar is youngest");
        }
        else {
            System.out.println("Anthony is youngest");
        }

        if(heightAmar > heightAkbar && heightAmar > heightAnthony){
            System.out.println("Amar is tallest");
        }
        else if(heightAkbar > heightAmar && heightAkbar > heightAnthony){
            System.out.println("Akbar is tallest");
        }
        else {
            System.out.println("Anthony is tallest");
        }
    }
}
