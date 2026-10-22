package bank_account;

public class BankAccount {
    
    private double balance;
    private boolean isFrozen;

    public BankAccount() {
        balance = 0.0;
        isFrozen = false;
    }

    public void deposit(double amount) {

        if (isFrozen) {
            System.out.println("Account Frozen");
            System.out.println("Unable to transact");
            return;
        }else if (amount <= 0) {
            System.out.println("Amount deposited: " + amount);
            System.out.println("Invalid amount. Must be greater than 0");
            return;
        }
        balance += amount;
        System.out.printf("Amount deposited: %.2f%n", amount);
        System.out.printf("Current balance: %.2f%n", balance);
    }

    public void withdraw(double amount) {
        if (isFrozen) {
            System.out.println("Account Frozen");
            System.out.println("Unable to transact");
            return;
        }else if (amount <= 0) {
            System.out.println("Amount withdrawn: " + amount);
            System.out.println("Invalid amount. Must be greater than 0");
            return;
        }else if (amount > balance) {
            System.out.println("Amount withdrawn: " + amount);
            System.out.println("Insufficient balance");
            System.out.printf("Current balance: %.2f%n", balance);
            return;
        }
        balance -= amount;
        System.out.printf("Amount withdrawn: %.2f%n", amount);
        System.out.printf("Current balance: %.2f%n", balance);
    }

    public double getBalance(){
        return balance;
    }

    public void freezeAccount() {
        isFrozen = true;
    }

     public void unfreezeAccount() {
        isFrozen = false;
    }

    public boolean isFrozen(){
        return isFrozen;
    }
}
