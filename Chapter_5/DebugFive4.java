import java.util.*;

public class DebugFive4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer >> ");
        int one = input.nextInt();
        System.out.print("Enter second integer >> ");
        int two = input.nextInt();
        System.out.print("Enter third integer >> ");
        int three = input.nextInt();
        System.out.print("Enter fourth integer >> ");
        int four = input.nextInt();

        int highest = one;

        if (two > highest) highest = two;
        if (three > highest) highest = three;
        if (four > highest) highest = four;

        System.out.println("The highest number is " + highest);
    }
}
