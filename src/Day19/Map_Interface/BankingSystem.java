package Day19.Map_Interface;

import java.util.*;
class WithdrawalRequest{
    private int accountNumber;
    private double balance;
    public WithdrawalRequest(int accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public int getAccountNumber() {
        return accountNumber;
    }
    public double getBalance() {
        return balance;
    }
}
public class BankingSystem {
    private HashMap<Integer, Double> accounts;
    private TreeMap<Double, Integer> sortedAccounts;
    private Queue<WithdrawalRequest> withdrawalQueue;
    public BankingSystem() {
        accounts = new HashMap<>();
        sortedAccounts = new TreeMap<>();
        withdrawalQueue = new LinkedList<>();
    }
    public void addAccount(Integer accountNumber, double balance){
        accounts.put(accountNumber, balance);
        sortedAccounts.put(balance, accountNumber);
    }
    public void processWithdrawals() {
        while (!withdrawalQueue.isEmpty()) {
            WithdrawalRequest request = withdrawalQueue.poll();
            int accountNumber = request.getAccountNumber();
            double amount = request.getBalance();
            if (accounts.containsKey(accountNumber) && accounts.get(accountNumber) >= amount) {
                double newBalance = accounts.get(accountNumber) - amount;
                accounts.put(accountNumber, newBalance);

                // Update the TreeMap
                sortedAccounts.remove(accounts.get(accountNumber));
                sortedAccounts.put(newBalance, accountNumber);
            }
        }
    }
    public void addWithdrawalRequest(int accNumber, double amount) {
        withdrawalQueue.add(new WithdrawalRequest(accNumber, amount));
    }
    public void displaySortedAccounts() {
        for (Map.Entry<Double, Integer> entry : sortedAccounts.entrySet()) {
            System.out.println("Account Number: " + entry.getValue() + ", Balance: " + entry.getKey());
        }
    }
    public static void main(String[] args) {
        BankingSystem bank = new BankingSystem();
        bank.addAccount(101, 5000);
        bank.addAccount(102, 3000);
        bank.addAccount(103, 7000);
        bank.addWithdrawalRequest(101, 1000);
        bank.processWithdrawals();
        bank.displaySortedAccounts();
    }
}
