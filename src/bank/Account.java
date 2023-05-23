package bank;
/** KRAV
 * Dina tester ska vara gröna och metoderna i Account ska vara säkrade från felaktiga inmatningar.
 */

public class Account {

    private double balance;
    private int accountNumber;

    /**Sets initial balance and account number*/
    public Account(double initialCash, int accountNumber) {
        // Can't be able to add a negative amount of cash
    }

    /**Add money to balance*/
    public double deposit(double cash) {
        // Can't be able to add a negative amount of cash
        return 0;
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
