import bank_account.BankAccount;
import bank_account.BankAccountManager;
import bank_account.SavingsAccount;
import exception.AccountFrozenException;
import exception.InsufficientFundsException;
import exception.InvalidAmountException;

/**
 * Runs the bank account and collection exercise test cases.
 */
public class App {

    /**
     * Runs the program and tests the bank account features.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {

        System.out.println("Exercise 1 Test Cases");
        System.out.println("\nTest Case ");

        BankAccount acc1 = new SavingsAccount("Test0");
        System.out.println("Account Owner: "
                + ((SavingsAccount) acc1).getOwnerName() + ".");

        System.out.println("\nTest Case 1");
        try {
            acc1.deposit(-500);
        } catch (InvalidAmountException | AccountFrozenException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\nTest Case 2");
        try {
            acc1.freezeAccount();
            acc1.deposit(11500);
        } catch (InvalidAmountException | AccountFrozenException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\nTest Case 3");
        try {
            acc1.unfreezeAccount();
            acc1.withdraw(-100);
        } catch (InsufficientFundsException | InvalidAmountException e) {
            System.out.println(e.getMessage());
        } catch (AccountFrozenException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\nTest Case 4");
        try {
            acc1.withdraw(1500);
        } catch (InsufficientFundsException | InvalidAmountException e) {
            System.out.println(e.getMessage());
        } catch (AccountFrozenException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\nTest Case 5");
        try {
            acc1.freezeAccount();
            acc1.withdraw(500);
        } catch (InsufficientFundsException | InvalidAmountException e) {
            System.out.println(e.getMessage());
        } catch (AccountFrozenException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\nTest Case 6");

        BankAccountManager accM1 = new BankAccountManager();

        try {
            acc1.unfreezeAccount();
            acc1.deposit(1000.125);
            acc1.withdraw(500);
        } catch (InvalidAmountException
                | AccountFrozenException
                | InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(
                "Filtering transactions at or above 200...");

        System.out.println(
                accM1.filterTransactionsAtOrAbove(
                        200, acc1.getTransactionHistory()));

        // System.out.println("\nTest Case 3");
        // try {
        //     acc1.deposit(0);
        // } catch (InvalidAmountException | AccountFrozenException e) {
        //     System.out.println(e.getMessage());
        // }

        // System.out.println("\nTest Case 4");
        // try {
        //     acc1.deposit(-500);
        // } catch (InvalidAmountException | AccountFrozenException e) {
        //     System.out.println(e.getMessage());
        // }

        // System.out.println("\nTest Case 5");
        // try {
        //     acc1.withdraw(500);
        // } catch (InsufficientFundsException
        //         | InvalidAmountException
        //         | AccountFrozenException e) {
        //     System.out.println(e.getMessage());
        // }

        // System.out.println("\nTest Case 6");
        // try {
        //     acc1.withdraw(1500);
        // } catch (InsufficientFundsException
        //         | InvalidAmountException
        //         | AccountFrozenException e) {
        //     System.out.println(e.getMessage());
        // }

        // System.out.println("\nTest Case 7");
        // try {
        //     acc1.withdraw(-100);
        // } catch (InsufficientFundsException
        //         | InvalidAmountException
        //         | AccountFrozenException e) {
        //     System.out.println(e.getMessage());
        // }

        // System.out.println("\nTest Case 8");
        // acc1.freezeAccount();
        // try {
        //     acc1.deposit(11500);
        // } catch (InvalidAmountException | AccountFrozenException e) {
        //     System.out.println(e.getMessage());
        // }

        // System.out.println("\nTest Case 9");
        // try {
        //     acc1.withdraw(500);
        // } catch (InsufficientFundsException
        //         | InvalidAmountException
        //         | AccountFrozenException e) {
        //     System.out.println(e.getMessage());
        // }

        // System.out.println("\nTest Case 10");
        // acc1.unfreezeAccount();
        // try {
        //     acc1.withdraw(100);
        // } catch (InsufficientFundsException
        //         | InvalidAmountException
        //         | AccountFrozenException e) {
        //     System.out.println(e.getMessage());
        // }

        // System.out.println("\nExercise 2 Test Cases");

        // System.out.println("Test Case 1");
        // System.out.println(
        //         "Transaction history: "
        //                 + acc1.getTransactionHistory());

        // System.out.println("\nTest Case 2");
        // BankAccountManager accM1 = new BankAccountManager();

        // System.out.println("\nTest Case 3");
        // accM1.addAccount(acc1);

        // System.out.println("\nTest Case 4");
        // accM1.addAccount(new SavingsAccount("Test1"));

        // System.out.println("\nTest Case 5");
        // accM1.listAccounts();

        // System.out.println("\nTest Case 6");
        // try {
        //     acc1.withdraw(5000);
        // } catch (InsufficientFundsException
        //         | InvalidAmountException
        //         | AccountFrozenException e) {
        //     System.out.println(e.getMessage());
        // }
    }
}