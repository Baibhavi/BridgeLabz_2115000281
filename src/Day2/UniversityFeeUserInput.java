package Day2;
import java.util.Scanner;
public class UniversityFeeUserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double fee = input.nextInt();
        double discountPercent = input.nextInt();
        double discount = (fee * discountPercent) / 100;
        double finalFee = fee - discount;
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);
    }
}
