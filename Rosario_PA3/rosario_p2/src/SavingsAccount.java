public class SavingsAccount extends APPLICATION {

    private static double annualInterestRate; // store the annual interest rate for all account holders
    private double savingsBalance; // indicating the amount the saver currently has in deposit.
    public static double monthlyInterest;
    private double oldBalance;


    SavingsAccount() {
        annualInterestRate = 0;
        savingsBalance = 0;
    }

    public void setBalance(double amount) {
        savingsBalance = amount;
        oldBalance = amount;
    }

    public double getSavingsBalance () {
        return savingsBalance;
    }

    public static double getAnnualInterestRate() {
        return annualInterestRate;
    }

    // calculate the monthly interest by multiplying the savingsBalance by
    // annualInterestRate divided by 12
    //this interest should be added to savingsBalance.
    public void calculateMonthlyInterest() {
        oldBalance = savingsBalance;
        monthlyInterest = (savingsBalance * annualInterestRate) / 12.0;
        monthlyInterest = Math.floor(monthlyInterest * 100) / 100;
        savingsBalance = savingsBalance + (savingsBalance * annualInterestRate);
        savingsBalance = Math.floor(savingsBalance * 100) / 100;
    }

    // sets the annualInterestRate to a new value.
    public static void modifyInterestRate(double rate) {
        annualInterestRate = rate;
    }

    public void print() {
        System.out.println("\t\tYour previous balance was:\t\t\t" + oldBalance);
        System.out.println("\t\tYour new balance is:\t\t\t\t" + savingsBalance);
        System.out.println("\t\tWith an Annual Interest Rate at: \t" + (int) Math.floor(annualInterestRate * 100) + "%");
        System.out.println("\t\tAnd a Monthly Interest Rate at: \t" + monthlyInterest);

    }
}
