
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

        System.out.println("Exercise 1 Test Cases");
        System.out.println("\nTest Case 1");
        BankAccount acc1 = new SavingsAccount("Test0");
        System.out.println("Account Owner: " + ((SavingsAccount) acc1).getOwnerName()+".") ;

        System.out.println("\nTest Case 2");
        acc1.deposit(1000.125);

        System.out.println("\nTest Case 3");
        acc1.deposit(0);

        System.out.println("\nTest Case 4");
        acc1.deposit(-500);

        System.out.println("\nTest Case 5");
        acc1.withdraw(500);

        System.out.println("\nTest Case 6");
        acc1.withdraw(1500);

        System.out.println("\nTest Case 7");
        acc1.withdraw(-100);

        System.out.println("\nTest Case 8");
        acc1.freezeAccount();
        acc1.deposit(11500);
        
        System.out.println("\nTest Case 9");
        acc1.withdraw(500);

        System.out.println("\nTest Case 10");
        acc1.unfreezeAccount();
        acc1.withdraw(100);

        System.out.println("\nExercise 2 Test Cases");
        System.out.println("Test Case 1");
        System.out.println(
                "Transaction history: "
                        + acc1.getTransactionHistory());

        System.out.println("\nTest Case 2");
        BankAccountManager accM1 = new BankAccountManager();

        System.out.println("\nTest Case 3");
        accM1.addAccount(acc1);

        System.out.println("\nTest Case 4");
        accM1.addAccount(new SavingsAccount("Test1"));

        System.out.println("\nTest Case 5");
        accM1.listAccounts();
        
    }
}
