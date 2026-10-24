
package bank_account;

/**
 * Represents a savings account.
 */
public class SavingsAccount extends BankAccount {

    private String ownerName;

    /**
     * Creates a savings account for the specified owner.
     *
     * @param ownerName the name of the account owner
     */
    public SavingsAccount(String ownerName) {
        this.ownerName = ownerName;
    }

    /**
     * Returns the account owner's name.
     *
     * @return the account owner's name
     */
    public String getOwnerName() {
        return ownerName;
    }
}
