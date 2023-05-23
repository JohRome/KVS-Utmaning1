package bank;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    Account sut;


    @Test
    public void cantSetInitialCashToNegative() {
        // Arrange
        double expected = 0;
        // Act
        sut = new Account(0, 1);
        // Assert
        assertEquals(expected, sut.getBalance());
    }

    @Test
    public void cantSetAccountNumberToNegative() {
        // Arrange
        int expected = 1;
        // Act
        sut = new Account(0, 1);
        // Assert
        assertEquals(expected, sut.getAccountNumber());
    }

    @Test
    public void cantDepositNegativeOrZeroAmountToBalance() {
        // Arrange
        sut = new Account(1, 1);
        double expected = 2;
        // Act
        sut.deposit(1);
        // Assert
        assertEquals(expected, sut.getBalance(), 0.1);
    }

    @Test
    public void canDepositToBalance() {
        // Arrange
        sut = new Account(1,1);
        double expected = 11;
        // Act
        sut.deposit(10);
        // Assert
        assertEquals(expected, sut.getBalance(), 0.1);
    }

    @Test
    public void cantWithdrawIfNotEnoughMoney() {
        // Arrange
        sut = new Account(11,1);
        double expected = 0;
        // Act
        double value = sut.withdraw(11);
        // Assert
        double moneyLeft = sut.getBalance() - value;
        assertEquals(expected,moneyLeft, 0.1);
    }

    @Test
    void canWithdrawIfEnoughMoney() {
        // Arrange
        sut = new Account(13.37,1);
        double expected = 0.37;
        // Act
        sut.withdraw(13);
        // Assert
        assertEquals(expected, sut.getBalance(),0.1);
    }
}