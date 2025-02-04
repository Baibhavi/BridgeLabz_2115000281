package Day9.Level1;

public class BankAccount {
    private static String bankName = "State Bank Of India";
    private static int totalAccounts = 0;
    private final int accountNumber;
    private String accountHolderName;
    private double balance;
    public BankAccount(String accountHolderName, int accountNumber, double balance){
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        totalAccounts++;
    }
    public static int getTotalAccounts(){
        return totalAccounts;
    }
    public void displayDetails(){
        if(this instanceof BankAccount){
            System.out.println("Bank Name : " + bankName);
            System.out.println("Account Holder Name : " + this.accountHolderName);
            System.out.println("Account Number : " + this.accountNumber);
            System.out.println("Account Balance : " + this.balance);
            System.out.print("\n-----------------------------------------------------------------------------------------------\n");
        }
        else{
            System.out.println("Invalid User");
        }
    }
    public static void main(String[] args) {
        BankAccount user1 = new BankAccount("John Doe", 1001, 20000);
        BankAccount user2 = new BankAccount("Jane Doe", 1002, 15000);
        user1.displayDetails();
        user2.displayDetails();
        System.out.println("Total number of accounts are " + totalAccounts);
    }
}
