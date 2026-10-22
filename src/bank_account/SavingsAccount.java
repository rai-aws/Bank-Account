package bank_account;
/*
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

        // Test 1
        System.out.println("\nTest Case 1");
        BankAccount acc1 = new SavingsAccount("Test0");
        System.out.println("Account Owner: " + ((SavingsAccount) acc1).getOwnerName());
        
        // Test 2
        System.out.println("\nTest Case 2");
        acc1.deposit(1000.125);

        // Test 3
        System.out.println("\nTest case 3");
        acc1.deposit(0);

        // Test 4
        System.out.println("\nTest Case 4");
        acc1.deposit(-500);

        // Test 5
        System.out.println("\nTest Case 5");
        acc1.withdraw(500);

        // Test 6
        System.out.println("\nTest Case 6");
        acc1.withdraw(1500);

        // Test 7
        System.out.println("\nTest Case 7");
        acc1.withdraw(-100);

        // test 8
        System.out.println("\nTest Case 8");
        acc1.freezeAccount();
        acc1.deposit(11500);

        // test 9
        System.out.println("\nTest Case 9");
        acc1.withdraw(500);

        // test 10
        System.out.println("\nTest Case 10");
        acc1.unfreezeAccount();
        acc1.withdraw(100);

        
    }
}

    


