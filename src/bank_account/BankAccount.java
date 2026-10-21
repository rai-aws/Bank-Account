package bank_account;

public class BankAccount {

    private double balance;
    private boolean isFrozen;

    public BankAccount() {
        balance = 0.0;
        isFrozen = false;
    }

    public void deposit(double amount) {

        if(isFrozen){
            System.out.println("Account Frozen");
        }if(amount <= 0 ){
            System.out.println("Invalid amount. Must be greater than 0");
        }else{
            balance += amount;
            System.out.printf("Amount: ", balance);
        }
        
    }

    public void withdraw(double amount) {

        if(isFrozen){
            System.out.println("Account Frozen");
        }if(amount <= 0){
            System.out.println("Amount invalid");
        } else if (amount > balance) {
            System.out.println("Insufficient balance");
        }else{
            balance -= amount;
            System.out.printf("Withdrawn: ", amount );
        }
        
    }

    //get balance

    public double getBalance(){
        return balance;
    }

    public void freezeAccount() {
        isFrozen = true;
        System.out.println("Account frozen");
    }

     public void unfreezeAccount() {
        isFrozen = false;
        System.out.println("Account unfrozen");
    }

    public boolean isFrozen(){
        return isFrozen;
    }

    

}
