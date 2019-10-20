import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MonthlyInterestAt4PercentTest {

    private static SavingsAccount saver1;
    private static SavingsAccount saver2;

    @Test
    void calculateMonthlyInterest() {

        saver1 = new SavingsAccount();
        saver2 = new SavingsAccount();

        saver1.setBalance(2000.00);
        saver2.setBalance(3000.00);

        System.out.println("\n---------------------ACCOUNTS----------------------");
        SavingsAccount.modifyInterestRate(.04);

        saver1.calculateMonthlyInterest();
        System.out.println("Saver 1:");
        saver1.print();

        assertEquals(6.66, SavingsAccount.monthlyInterest);

        saver2.calculateMonthlyInterest();
        System.out.println("\nSaver 2:");
        saver2.print();

        assertEquals(10.0, SavingsAccount.monthlyInterest);
    }
}