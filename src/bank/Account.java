package bank;
/** KRAV
 * Dina tester ska vara gröna och metoderna i Account ska vara säkrade från felaktiga inmatningar.
 */

public class Account {

    private final double balance;
    private int accountNumber;

    /**Sets initial balance and account number*/
    public Account(double initialCash, int accountNumber) {
        // Can't be able to add a negative amount of cash
        if (initialCash < 0) {
            System.out.println("Balance can't be < 0");
            this.balance = 0;
        } else {
            this.balance = initialCash;
        }

        if (accountNumber < 0) {
            System.out.println("Account number can't be < 0");
        } else {
            this.accountNumber = accountNumber;
        }

        // Can't be able to add a negative account number
    }

    /**Add money to balance*/
    public void deposit(double cash) {
        if (cash <= 0) {
            System.out.println("Can't deposit 0 or < 0");
        }
        // Can't be able to add a negative amount of cash
        // Can't be able to deposit 0

    }
    /**Withdraw money from balance*/
    public double withdraw(double cash) {
        // Can't be able to add a negative amount of cash
        // Can't be able to withdraw if amount is > balance
        return 0;
    }
    /**Display balance*/
    public double getBalance() {
        return balance;
    }
    /**Display account number*/
    public int getAccountNumber() {
        return accountNumber;
    }
}
