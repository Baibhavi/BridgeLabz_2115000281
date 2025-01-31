package Day8.AccessModifier;
class BankAccount {
    public long accountNumber;
    protected String accountHolder;
    private double balance;

    public BankAccount(long accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
    public double getBalance() {
        return balance;
    }

    // Public method to modify balance
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(1234567890L, "Alice Smith", 5000.0, 3.5);
        savingsAccount.displayAccountInfo();
        savingsAccount.setBalance(6000.0);
        System.out.println("Updated Balance: " + savingsAccount.getBalance());
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(long accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }
    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + getBalance());
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}
