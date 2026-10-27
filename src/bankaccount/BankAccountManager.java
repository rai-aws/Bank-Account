package bankaccount;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Manages bank accounts using a map of account IDs and accounts.
 */
public class BankAccountManager implements Bank {
    private Map<Integer, BankAccount> accounts;
    private int id;

    /**
     * Creates an empty account manager with IDs starting at zero.
     */
    public BankAccountManager() {
        accounts = new HashMap<>();
        id = 0;
    }

    /**
     * Adds an account if the maximum account limit is not reached.
     *
     * @param account the account to add
     */
    public void addAccount(BankAccount account) {
        if (accounts.size() > 100) {
            System.out.println("Maximum account limit reached");
            return;
        }

        accounts.put(id, account);
        System.out.println(
                "Account added successfully with ID: " + id);
        id++;
    }

    /**
     * Retrieves an account using its ID.
     *
     * @param id the account ID
     * @return the account, or null if it does not exist
     */
    public BankAccount getAccount(int id) {
        return accounts.get(id);
    }

    /**
     * Displays all accounts, including their IDs, names, and balances.
     */
    public void listAccounts() {
        for (Map.Entry<Integer, BankAccount> entry : accounts.entrySet()) {
            BankAccount account = entry.getValue();
            double balance = account.getBalance();
            String formatBalance;

            if (balance == 0.0) {
                formatBalance = "0.0";
            } else {
                formatBalance = String.format("%.2f", balance);
            }

            System.out.println(
                    "Account ID: " + entry.getKey()
                            + ", Account Name: " + account.getOwnerName()
                            + ", Balance: " + formatBalance);
        }
    }

    /**
     * Filters transactions at or above a specified amount.
     *
     * @param amount the minimum transaction amount
     * @param transactions the list of transactions
     * @return the transactions matching the minimum amount
     */
    public List<Transaction> filterTransactionsAtOrAbove(
            double amount, List<Transaction> transactions) {
        List<Transaction> filteredTransactions = new ArrayList<>();

        transactions.stream()
                .filter(transaction -> transaction.getAmount() >= amount)
                .forEach(transaction -> filteredTransactions.add(transaction));

        return filteredTransactions;
    }

    /**
     * Sorts transactions by amount in ascending order.
     *
     * @param transactions the list of transactions
     * @return the sorted transactions
     */
    public List<Transaction> sortTransactionsByAmount(
            List<Transaction> transactions) {
        List<Transaction> sortedTransactions =
                new ArrayList<>(transactions);

        sortedTransactions.sort(
                (transaction1, transaction2) ->
                        Double.compare(
                                transaction1.getAmount(),
                                transaction2.getAmount()));

        return sortedTransactions;
    }
}
