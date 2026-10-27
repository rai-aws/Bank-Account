package exception;

public class InsufficientFundsException extends Exception {
    private String message;

    public InsufficientFundsException() {
        this.message = "Insufficient balance";
    }

    public String getMessage() {
        return message;
    }

}
