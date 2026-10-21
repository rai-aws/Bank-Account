package bank_account;




import java.util.Scanner;

/**
 * Represents a savings account.
 */
public class SavingsAccount extends BankAccount {

    private String ownerName;

    public SavingsAccount(String ownerName) {
        this.ownerName = ownerName;
    }


    public String getOwnerName() {
        return ownerName;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Test 2
        // BankAccount acc1 = new SavingsAccount("Test0");
        acc1.deposit(-500);
        System.out.printf("Balance: %.2f%n", acc1.getBalance());



        input.close();


        // //Test 1
        // BankAccount acc1 = new SavingsAccount("Test0");
        // System.out.println("Owner: "
        //         + ((SavingsAccount) acc1).getOwnerName());

        // Test 2
        // BankAccount acc1 = new SavingsAccount("Test0");
        // acc1.deposit(1000.125);
        // System.out.printf("Balance: %.2f%n", acc1.getBalance());

        // Test 3
        // BankAccount acc1 = new SavingsAccount("Test0");
        // acc1.deposit(0);
        // System.out.printf("Balance: %.2f%n", acc1.getBalance());

        // Test 4
        // BankAccount acc1 = new SavingsAccount("Test0");
        // acc1.deposit(-500);
        // System.out.printf("Balance: %.2f%n", acc1.getBalance());
    }
}

    


