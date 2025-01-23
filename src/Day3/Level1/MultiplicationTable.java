package Day3.Level1;
import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int fromNum = input.nextInt();
        int toNum = input.nextInt();
        for(int i = fromNum; i <= toNum; i++){
            for(int j = 1; j <= 10; j++){
                System.out.println(i + " x " + j + " = " + i*j);
            }
            System.out.println();
        }
    }
}
