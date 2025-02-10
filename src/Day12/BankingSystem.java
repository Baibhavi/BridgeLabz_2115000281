package Day12;
abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;
    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public String getHolderName() {
        return holderName;
    }
    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited. New balance: " + balance);
        } else {
            System.out.println("Invalid amount. Deposit failed.");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn. New balance: " + balance);
        } else {
            System.out.println("Invalid amount or insufficient balance. Withdrawal failed.");
        }
    }
    public abstract double calculateInterest();
    public void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Balance: " + balance);
    }
}
interface Loanable {
    void applyForLoan(double amount);
    boolean calculateLoanEligibility();
}
class SavingsAccount extends BankAccount implements Loanable {
    private double interestRate = 0.04;

    public SavingsAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * interestRate;
    }

    @Override
    public void applyForLoan(double amount) {
        System.out.println("Loan of " + amount + " applied for Savings Account.");
    }

    @Override
    public boolean calculateLoanEligibility() {
        return getBalance() >= 1000;
    }
}
class CurrentAccount extends BankAccount implements Loanable {
    private double interestRate = 0.02;
    private double overdraftLimit = 5000;
    public CurrentAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }
    public double calculateInterest() {
        return getBalance() * interestRate;
    }
    public void applyForLoan(double amount) {
        System.out.println("Loan of " + amount + " applied for Current Account.");
    }
    public boolean calculateLoanEligibility() {
        return getBalance() >= 2000; // Eligible if balance is at least 2000
    }
}
public class BankingSystem {
    public static void main(String[] args) {
        BankAccount savingsAccount = new SavingsAccount("SA001", "Baibhavi Pandey", 5000);
        BankAccount currentAccount = new CurrentAccount("CA001", "Pooja", 3000);
        savingsAccount.displayDetails();
        System.out.println("Interest: " + savingsAccount.calculateInterest());
        if (savingsAccount instanceof Loanable) {
            Loanable loanable = (Loanable) savingsAccount;
            loanable.applyForLoan(10000);
            System.out.println("Loan Eligibility: " + loanable.calculateLoanEligibility());
        }
        System.out.println();
        currentAccount.displayDetails();
        System.out.println("Interest: " + currentAccount.calculateInterest());
        if (currentAccount instanceof Loanable) {
            Loanable loanable = (Loanable) currentAccount;
            loanable.applyForLoan(15000);
            System.out.println("Loan Eligibility: " + loanable.calculateLoanEligibility());
        }
    }
}
