package Day21;

class InsufficientBalanceException extends Exception{
    public InsufficientBalanceException(String message){
        super(message);
    }
}
public class BankTransactionSystem {
    private double balance;
    public BankTransactionSystem(double initialBalance){
        this.balance = initialBalance;
    }
    public void withdraw(double amount) throws InsufficientBalanceException{
        if(amount < 0){
            throw new IllegalArgumentException("Invalid amount!");
        }
        if(amount > balance){
            throw new InsufficientBalanceException("Insufficient balance!");
        }
        balance -= amount;
        System.out.println("Withdrawal successful, new balance: " + balance);
    }
    public static void main(String[] args) {
        BankTransactionSystem account = new BankTransactionSystem(1000.0);
        try {
            account.withdraw(500.0);
            account.withdraw(600.0);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        try {
            account.withdraw(-100.0);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
