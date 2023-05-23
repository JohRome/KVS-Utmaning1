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
}