package bank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    Account sut;
    @Test
    public void cantSetInitialCashToNegativeNumber() {
        // Arrange
        double expected = 0;
        // Act
        sut = new Account(-1, 0);
        // Assert
        assertEquals(expected, sut.getBalance());
    }
}