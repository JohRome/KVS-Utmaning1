package bank;
/** KRAV
 * Dina tester ska vara gröna och metoderna i Account ska vara säkrade från felaktiga inmatningar.
 */

public class Account {

    private double balance;
    private final int accountNumber;

    /**Sets initial balance and account number*/
    public Account(double initialCash, int accountNumber) {
        // Can't be able to add < 0 amount of money
        if (initialCash < 0) {
            throw new IllegalArgumentException("You can't open a bank account with a negative amount");
        } else {
            this.balance = initialCash;
        }
        // Can't be able to set account number to <= 0
        if (accountNumber <= 0) {
            throw new IllegalArgumentException("Account number cant be <= 0");
        } else {
            this.accountNumber = accountNumber;
        }
    }

    /**Add money to balance*/
    public void deposit(double cash) {
        // Can't be able to add <= 0 amount to balance
        if (cash <= 0)
            throw new IllegalArgumentException("Can't deposit <= 0 money");
        else
            this.balance += cash;
    }

    /**Withdraw money from balance*/
    public double withdraw(double cash) { // ändra returntype till void för att vi redan har getBalance()
        // Can't be able to withdraw if amount is > balance
        if (cash > balance)
            throw new IllegalArgumentException("You can't rob the bank. The bank robs you!");
        else
            this.balance -= cash;
        return this.balance;
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
