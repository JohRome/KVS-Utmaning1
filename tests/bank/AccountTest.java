package bank;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    Account sut;

    @BeforeEach
    public void Account() {
        sut = new Account(0,0);
    }

    @Test
    public void cantSetInitialCashToNegative() {
        // Arrange
        double expected = 0;
        // Act
        sut = new Account(-1, 0);
        // Assert
        assertEquals(expected, sut.getBalance());
    }

    @Test
    public void cantSetAccountNumberToNegative() {
        // Arrange
        int expected = 0;
        // Act
        sut = new Account(0, -1);
        // Assert
        assertEquals(expected, sut.getAccountNumber());
    }

    @Test
    public void cantDepositNegativeOrZeroAmount() {
        // Arrange
        double expected = 0;
        // Act
        double actual = -1.3;
        sut.deposit(actual);
        // Assert
        assertEquals(expected, actual);

    }
}