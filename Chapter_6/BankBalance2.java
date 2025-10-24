import java.util.Scanner;

public class BankBalance2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double balance;
        double interestRate = 0.03;
        int year = 1;
        int response;

        System.out.print("Enter initial bank balance: ");
        balance = input.nextDouble();

        do {
            balance = balance + (balance * interestRate);
            System.out.printf("After year %d at %.2f interest rate, balance is $%.2f%n",
                    year, interestRate, balance);

            System.out.println("\nDo you want to see the balance at the end of another year?");
            System.out.print("Enter 1 for yes\n   or any other number for no >> ");
            response = input.nextInt();

            year++;
        } while (response == 1);

        System.out.println("\nOperation complete.");
        input.close();
    }
}
