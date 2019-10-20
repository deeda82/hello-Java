import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SetAnnualInterestRateTo5Test {

    @Test
    void modifyInterestRate() {

        SavingsAccount.modifyInterestRate(.05);

        assertEquals(.05, SavingsAccount.getAnnualInterestRate());
    }
}