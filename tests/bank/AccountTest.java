package bank;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    Account sut;

    @BeforeEach
    public void Account() {
        // Kollar om allt funkar/inte funkar vid byte av värden
        sut = new Account(0,10);
    }

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
        double expected = 0;
        // Act
        double actual = sut.deposit(-1);
        // Assert
        assertEquals(expected,actual);
    }

    @Test
    public void canDepositToBalance() {
        //Arrange
        double expected = sut.getBalance();
        // Act
        double actual = sut.deposit(1);
        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void cantWithdrawIfNotEnoughMoney() {
        // Arrange
        double expected = 101;
        // Act
        double actual = sut.withdraw(100);
        // Assert
        assertEquals(expected, actual);
    }
}