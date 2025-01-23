package Day3.Level1;
import java.util.Scanner;
public class RocketLaunchCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = input.nextInt();
        while(counter > 0){
            System.out.println(counter);
            counter--;
        }
    }
}
