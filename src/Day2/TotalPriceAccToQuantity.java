package Day2;
import java.util.Scanner;
public class TotalPriceAccToQuantity {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double unitPrice = input.nextDouble();
        double quantity = input.nextDouble();
        double totalPrice = unitPrice*quantity;
        System.out.println("The total purchase price is INR " + totalPrice+" if the quantity "+quantity+" and unit price is INR "+unitPrice);
    }
}
