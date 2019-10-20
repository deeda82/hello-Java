public class APPLICATION {
    /*
    Write a program to test class SavingsAccount. Instantiate two SavingsAccount objects,
    saver1 and saver2, with balances of $2000.00 and $3000.00, respectively.
    Set annualInterestRate to 4%, then calculate the monthly interest for each of 12 months
    and print the new balances for both savers. Next, set the annualInterestRate to 5%,
    calculate the next month’s interest and print the new balances for both savers.
     */
    private static SavingsAccount saver1;
    private static SavingsAccount saver2;

    public static void main(String[] args) {

        saver1 = new SavingsAccount();
        saver2 = new SavingsAccount();

        saver1.setBalance(2000.00);
        saver2.setBalance(3000.00);

        System.out.println("\n---------------------ACCOUNTS----------------------");
        SavingsAccount.modifyInterestRate(.04);

        saver1.calculateMonthlyInterest();
        System.out.println("Saver 1:");
        saver1.print();

        saver2.calculateMonthlyInterest();
        System.out.println("\nSaver 2:");
        saver2.print();

        System.out.println("\n---------------------ACCOUNTS----------------------");

        SavingsAccount.modifyInterestRate(.05);

        saver1.calculateMonthlyInterest();
        System.out.println("Saver 1:");
        saver1.print();

        saver2.calculateMonthlyInterest();
        System.out.println("\nSaver 2:");
        saver2.print();
    }
}
