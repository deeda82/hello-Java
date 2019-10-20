import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SetAnnualInterestRateTo4Test {

    @Test
    void modifyInterestRate() {

        SavingsAccount.modifyInterestRate(.04);

        assertEquals(.04, SavingsAccount.getAnnualInterestRate());
    }
}