
package bankaccount;

/**
 * Defines the operations for managing bank accounts.
 */
public interface Bank {

    /**
     * Adds an account to the bank.
     *
     * @param account the account to add
     */
    void addAccount(BankAccount account);

    /**
     * Retrieves an account using its ID.
     *
     * @param id the account ID
     * @return the account, or null if it does not exist
     */
    BankAccount getAccount(int id);
}
