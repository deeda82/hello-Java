import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SavingsAccountTest{

    private static SavingsAccount saver1;
    private static SavingsAccount saver2;

    @Test
    void setBalance() {
        saver1 = new SavingsAccount();
        saver2 = new SavingsAccount();

        saver1.setBalance(2000.00);
        saver2.setBalance(3000.00);

        assertEquals(2000.00, saver1.getSavingsBalance());
        assertEquals(3000.00, saver2.getSavingsBalance());
    }

}