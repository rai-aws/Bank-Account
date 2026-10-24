
package bank_account;

/**
 * Represents a bank account that supports deposits, withdrawals,
 * balance checking, and account freezing.
 */
public class BankAccount {

    private double balance;
    private boolean isFrozen;

    /**
     * Creates a new bank account with an initial balance of zero
     * and an unfrozen status.
     */
    public BankAccount() {
        balance = 0.0;
        isFrozen = false;
    }

    /**
     * Deposits money into the account if the account is not frozen
     * and the amount is greater than zero.
     *
     * @param amount the amount of money to deposit
     */
    public void deposit(double amount) {

        if (isFrozen) {
            System.out.println("Account Frozen");
            System.out.println("Unable to transact");
            return;
        }

        if (amount <= 0) {
            System.out.println("Amount deposited: " + amount);
            System.out.println("Invalid amount. Must be greater than 0");
            return;
        }

        balance += amount;
        System.out.printf("Amount deposited: %.2f%n", amount);
        displayBalance();
    }

    /**
     * Withdraws money from the account if the account is not frozen,
     * the amount is greater than zero, and sufficient funds are available.
     *
     * @param amount the amount of money to withdraw
     */
    public void withdraw(double amount) {

        if (isFrozen) {
            System.out.println("Account Frozen");
            System.out.println("Unable to transact");
            return;
        }

        if (amount <= 0) {
            System.out.println("Amount withdrawn: " + amount);
            System.out.println("Invalid amount. Must be greater than 0");
            return;
        }

        if (amount > balance) {
            System.out.println("Amount withdrawn: " + amount);
            System.out.println("Insufficient balance");
            displayBalance();
            return;
        }

        balance -= amount;
        System.out.printf("Amount withdrawn: %.2f%n", amount);
        displayBalance();
    }

    /**
     * Returns the current account balance.
     *
     * @return the current balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Freezes the account to prevent deposits and withdrawals.
     */
    public void freezeAccount() {
        isFrozen = true;
    }

    /**
     * Unfreezes the account to allow transactions again.
     */
    public void unfreezeAccount() {
        isFrozen = false;
    }

    /**
     * Displays the current account balance formatted to two decimal places.
     */
    public void displayBalance() {
        System.out.printf("Current balance: %.2f%n", balance);
    }
}
