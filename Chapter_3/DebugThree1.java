import java.util.Scanner;

public class DebugThree1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your check amount: ");
        double check1 = input.nextDouble();

        System.out.print("Enter your friend's check amount: ");
        double check2 = input.nextDouble();

        printTip(check1);
        printTip(check2);

        input.close();
    }

    public static void printTip(double bill) {
        double tip = bill * 0.15;
        System.out.println("Tip should be at least $" + tip);
    }
}
