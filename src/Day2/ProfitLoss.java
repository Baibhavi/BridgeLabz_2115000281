package Day2;

public class ProfitLoss {
    public static void main(String[] args) {
        int costPrice = 129;
        int sellingPrice = 191;
        int profit = sellingPrice-costPrice;
        float profitPercent = ((float) profit / (float)costPrice) *100;
        System.out.println("The Cost Price is INR "+ costPrice + " and Selling Price is INR "+ sellingPrice + "\n" +
                "The Profit is INR "+ profit + " and the Profit Percentage is " + profitPercent);
    }
}