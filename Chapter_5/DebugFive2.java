import java.util.Scanner;

public class DebugFive2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num1 = input.nextInt();

        System.out.print("Enter another number: ");
        int num2 = input.nextInt();

        if (num1 % num2 == 0 || num2 % num1 == 0) {
            System.out.println("One number is evenly divisible into the other.");
        } else {
            System.out.println("Neither number is evenly divisible into the other.");
        }
    }
}
