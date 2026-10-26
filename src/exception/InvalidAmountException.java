package exception;

public class InvalidAmountException extends Exception{
    private String message;

    public InvalidAmountException(){
        this.message = "Invalid amount. Must be greater than 0";
    }

    public String getMessage(){
        return message;
    }
}
