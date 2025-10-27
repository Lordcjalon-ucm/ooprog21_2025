import java.util.Scanner;

public class BankBalanceByRateAndYear {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double initialBalance;
        double balance;
        double interestRate;

        System.out.print("Enter initial bank balance > ");
        initialBalance = input.nextDouble();

        for (interestRate = 0.02; interestRate <= 0.05; interestRate += 0.01) {
            System.out.println("\nWith an initial balance of " + initialBalance +
                    " at an interest rate of " + interestRate);

            balance = initialBalance;

            for (int year = 1; year <= 4; year++) {
                balance = balance + (balance * interestRate);
                System.out.println("After year " + year + " balance is " + balance);

            }
        }

        input.close();
    }
}
