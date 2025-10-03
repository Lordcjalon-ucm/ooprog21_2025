import java.util.*;

public class DebugFive1 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        double bill = 0;

        System.out.println("Order please:");
        System.out.println("1 - Burger");
        System.out.println("2 - Hotdog");
        System.out.println("3 - Grilled cheese");
        System.out.println("4 - Fish sandwich");
        int choice = kb.nextInt();

        if(choice == 1 || choice == 2)
            bill = 2.59;
        else
            bill = 1.99;

        System.out.print("Fries with that? (1 - Yes, 2 - No) >> ");
        choice = kb.nextInt();
        if(choice == 1)
            bill += 0.89;

        System.out.println("Total bill is " + bill)
    }
}
