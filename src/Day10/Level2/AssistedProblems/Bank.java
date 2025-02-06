package Day10.Level2.AssistedProblems;

import java.util.ArrayList;
class Bank {
    private String bankName;
    private ArrayList<Customer> customers;
    public Bank(String bankName){
        this.bankName = bankName;
        this.customers = new ArrayList<>();
    }
    public void addCustomer(Customer customer){
        customers.add(customer);
    }
    public void openAccount(Customer customer, String accountNumber, double initialBalance){
        customer.addAccounts(accountNumber, initialBalance);
    }
    public String getBankName(){
        return bankName;
    }
}
class Customer{
    private String customerName;
    private ArrayList<Account> accounts;
    public Customer(String customerName){
        this.customerName = customerName;
        this.accounts = new ArrayList<>();
    }
    public void addAccounts(String accountNumber, double initialBalance){
        Account newAccount = new Account(accountNumber, initialBalance);
        accounts.add(newAccount);
    }
    public void viewBalance(){
        System.out.println("\nCustomer : " + customerName);
        for(Account account : accounts){
            System.out.println("Account Number : " + account.getAccountNumber() + "\nBalance : " + account.getBalance());
        }
    }
    public String getCustomerName(){
        return customerName;
    }
}
class Account{
    private String accountNumber;
    private double balance;
    public Account(String accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public String getAccountNumber(){
        return accountNumber;
    }
    public double getBalance(){
        return balance;
    }
}
class Main2{
    public static void main(String[] args) {
        Bank bank = new Bank("SBI");
        Customer customer1 = new Customer("Alice");
        Customer customer2 = new Customer("Bob");
        bank.addCustomer(customer1);
        bank.addCustomer(customer2);
        bank.openAccount(customer1, "3214", 4500);
        bank.openAccount(customer2, "6453", 2000);
        bank.openAccount(customer2, "8754", 6400);
        customer1.viewBalance();
        customer2.viewBalance();
    }
}