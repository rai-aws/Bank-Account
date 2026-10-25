
import bank_account.BankAccount;
import bank_account.BankAccountManager;
import bank_account.SavingsAccount;

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
        BankAccount acc1 = new SavingsAccount("Test0");

        System.out.println("Test Case 1: Deposit");
        acc1.deposit(1000.125);

        System.out.println("\nTest Case 2: Deposit zero");
        acc1.deposit(0);

        System.out.println("\nTest Case 3: Deposit negative amount");
        acc1.deposit(-500);

        System.out.println("\nTest Case 4: Withdraw");
        acc1.withdraw(500);

        System.out.println("\nTest Case 5: Withdraw more than balance");
        acc1.withdraw(1500);

        System.out.println("\nTest Case 6: Withdraw negative amount");
        acc1.withdraw(-100);

        System.out.println("\nTest Case 7: Frozen account");
        acc1.freezeAccount();
        acc1.deposit(11500);
        acc1.withdraw(500);

        System.out.println("\nTest Case 8: Unfreeze account");
        acc1.unfreezeAccount();
        acc1.withdraw(100);

        System.out.println("\nTest Case 1: Transaction history");
        System.out.println(
                "Transaction history: "
                        + acc1.getTransactionHistory());

        System.out.println("\nTest Case 2: Create account manager");
        BankAccountManager accM1 = new BankAccountManager();

        System.out.println("\nTest Case 3: Add acc1");
        accM1.addAccount(acc1);

        System.out.println("\nTest Case 4: Add a new account");
        accM1.addAccount(new SavingsAccount("Test1"));

        System.out.println("\nTest Case 5: List all accounts");
        accM1.listAccounts();
    }
}
