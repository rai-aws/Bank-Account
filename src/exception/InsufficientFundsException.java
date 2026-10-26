package exception;

public class InsufficientFundsException extends Exception {
    private String message;

    public InsufficientFundsException() {
        this.message = "Insufficient balance";
    }

    @Override
    public String getMessage() {
        return message;
    }

}
