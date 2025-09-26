import java.util.Scanner;

public class DebugFour2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        DebugPen pen1 = new DebugPen();

        System.out.print("Enter ink color >> ");
        String color = input.nextLine();
        System.out.print("Enter point size (fine/medium/thick) >> ");
        String point = input.nextLine();
        DebugPen pen2 = new DebugPen(point, color); 

        System.out.println("\nDefault Pen: " + pen1.getColor() + ", " + pen1.getPoint());
        System.out.println("User Pen: " + pen2.getColor() + ", " + pen2.getPoint());
    }
}

/*
   DEBUGGED CHANGES:
   1. Replaced 'pen2 = new DebugPen(point, color);' with correct constructor usage.
   2. Removed 'pen22' (typo) → used correct variable 'pen2'.
   3. Removed wrong 'FixDebugPen' class reference → replaced with 'DebugPen'.
   4. Removed display() method errors (p1, p) → simplified with direct println.
*/
