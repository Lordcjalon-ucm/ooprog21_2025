import java.util.Scanner;

public class BankBalance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double balance, interestRate = 0.03;
        int year = 1;
        int choice;

        System.out.print("Enter initial bank balance > ");
        balance = input.nextDouble();

        while (true) {
            System.out.print("Do you want to see next year's balance?\n"
                    + "Enter 1 for yes or any other number for no >> ");
            choice = input.nextInt();

            if (choice != 1)
                break;

            balance += balance * interestRate;
            System.out.println("After year " + year + " at 0.03 interest rate, balance is $" + balance);
            year++;
        }

        System.out.println("---- Program complete ----");
        input.close();
    }
}
