package exception;

public class AccountFrozenException extends Exception{
    private String message;

    public AccountFrozenException(){
        this.message ="Account is FROZEN. Unable to transact.";
    }
    
    public String getMessage(){
        return message;
    }
}
