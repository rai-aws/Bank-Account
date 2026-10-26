
package bank_account;

import exception.*;
import java.util.ArrayList;
import java.util.List;

/**
 *  and maintains its transaction history.
 */
public class BankAccount {
    private double balance;
    private boolean isFrozen;
    private String ownerName;
    private List<Transaction> transactionHistory;

    /**
     * Creates an account for the specified owner.
     *
     * @param ownerName the account owner's name
     */
    public BankAccount(String ownerName) {
        this.ownerName = ownerName;
        this.balance = 0.0;
        this.isFrozen = false;
        this.transactionHistory = new ArrayList<>();
    }

    /**
     * Deposits a valid amount into the account.
     *
     * @param amount the amount to deposit
     */
    public void deposit(double amount) throws InvalidAmountException, AccountFrozenException{
        if (isFrozen) {
            throw new AccountFrozenException();
            // return;
        }

        if (amount <= 0) {
            System.out.printf("Amount deposited: %.2f%n", amount);
            throw new InvalidAmountException();
            // return;
        }

        balance += amount;
        transactionHistory.add(new Transaction("Deposit", amount));

        System.out.printf("Amount deposited: %.2f%n", amount);
        displayBalance();
    }

    /**
     * Withdraws a valid amount if sufficient funds are available.
     *
     * @param amount the amount to withdraw
     */

//     Amount withdrawn: 1500.00
// Insufficient balance. 
// Current balance: 500.13 


    public void withdraw(double amount) 
            throws InsufficientFundsException,
                InvalidAmountException,
                AccountFrozenException {

        if (isFrozen) {
            throw new AccountFrozenException();
        }

        if (amount <= 0) {
            System.out.printf("Amount withdrawn: %.2f%n", amount);
            throw new InvalidAmountException();

        }

        if (amount > balance) {
            System.out.printf("Amount withdrawn: %.2f%n", amount);
            throw new InsufficientFundsException();
        }

        balance -= amount;
        transactionHistory.add(new Transaction("Withdraw", amount));

        System.out.printf("Amount withdrawn: %.2f%n", amount);
        displayBalance();
    }

    /**
     * Returns the current account balance.
     *
     * @return the account balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Returns the account owner's name.
     *
     * @return the owner's name
     */
    public String getOwnerName() {
        return ownerName;
    }

    /**
     * Returns the list of account transactions.
     *
     * @return the transaction history
     */
    public List<Transaction> getTransactionHistory() {
        return transactionHistory;
    }

    /**
     * Freezes the account.
     */
    public void freezeAccount() {
        isFrozen = true;
    }

    /**
     * Unfreezes the account.
     */
    public void unfreezeAccount() {
        isFrozen = false;
    }

    /**
     * Displays the current account balance.
     */
    public void displayBalance() {
        System.out.printf("Current balance: %.2f%n", balance);
    }
}
