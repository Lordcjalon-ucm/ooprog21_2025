import java.util.Scanner;

public class DebugFour1 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int radius;

        DebugCircle c = new DebugCircle();

        System.out.print("Enter a radius for a circle >> ");
        radius = input.nextInt();

        c = new DebugCircle(radius);

        System.out.println("The radius is " + c.getRad());
        System.out.println("The diameter is " + c.getDiam());
        System.out.println("The area is " + c.getArea());
    }
}

/*
DEBUGGED CODE:
1. Changed `Circle c = new Circle();` → `DebugCircle c = new DebugCircle();`
   (class name mismatch).
2. Fixed constructor call `new DebugCircle(c);` → `new DebugCircle(radius);`
   (must pass radius, not an object).
*/
