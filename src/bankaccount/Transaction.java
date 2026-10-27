
package bankaccount;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Represents a deposit or withdrawal transaction.
 */
public class Transaction {
    private String type;
    private double amount;
    private LocalDateTime time_stamp;

    /**
     * Creates a transaction with the current date and time.
     *
     * @param type   the transaction type
     * @param amount the transaction amount
     */
    public Transaction(String type, double amount) {
        this.type = type;
        this.amount = amount;
        this.time_stamp = LocalDateTime.now();
    }

    /**
     * Returns the transaction amount.
     *
     * @return the transaction amount
     */
    public double getAmount() {
        return amount;
    }

    /**
     * Returns the transaction details with a formatted timestamp.
     *
     * @return the transaction details
     */
    @Override
    public String toString() {
        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

        return "Transaction"
                + "\n  Type: " + type
                + "\n  Amount: " + String.format("%.2f", amount)
                + "\n  Timestamp: " + time_stamp.format(formatter)
                + "\n";
    }
}
