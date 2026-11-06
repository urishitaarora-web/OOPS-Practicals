// Practical 10: Encapsulation Using Getters, Setters, and Validation
class BankAccount {
    private String accountHolder;
    private String accountNumber;
    private double balance;

    BankAccount(String accountHolder, String accountNumber, double initialBalance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = initialBalance >= 0 ? initialBalance : 0;
    }

    String getAccountHolder() {
        return accountHolder;
    }

    String getAccountNumber() {
        return accountNumber;
    }

    double getBalance() {
        return balance;
    }

    void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit rejected: amount must be positive (" + amount + ").");
            return;
        }
        balance += amount;
        System.out.println("Deposited " + amount + ". New balance: " + balance);
    }

    void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal rejected: amount must be positive (" + amount + ").");
        } else if (amount > balance) {
            System.out.println("Withdrawal rejected: insufficient balance (" + amount
                    + " > " + balance + ").");
        } else {
            balance -= amount;
            System.out.println("Withdrew " + amount + ". New balance: " + balance);
        }
    }
}

public class Bank_P10 {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("Riya Sharma", "ACC1001", 5000);

        System.out.println("Holder: " + acc.getAccountHolder()
                + ", Account No: " + acc.getAccountNumber()
                + ", Balance: " + acc.getBalance());

        System.out.println("\nValid transactions");
        acc.deposit(2000);
        acc.withdraw(1500);

        System.out.println("\nInvalid transactions");
        acc.deposit(-500);      
        acc.withdraw(0);        
        acc.withdraw(-100);     
        acc.withdraw(20000);    

        System.out.println("\nFinal balance: " + acc.getBalance());

    }
}