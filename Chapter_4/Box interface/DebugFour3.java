import java.util.Scanner;

public class DebugFour3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter width >> ");
        int w = input.nextInt();
        System.out.print("Enter length >> ");
        int l = input.nextInt();
        System.out.print("Enter height >> ");
        int h = input.nextInt();

        DebugBox box1 = new DebugBox();
        DebugBox box2 = new DebugBox(w, l, h);

        System.out.println("\nDefault Box:");
        box1.showData();
        System.out.println("Volume: " + box1.getVolume());

        System.out.println("\nUser Box:");
        box2.showData();
        System.out.println("Volume: " + box2.getVolume());
    }
}

/*
   DEBUGGED CHANGES:
   1. input.nextInteger() → fixed to input.nextInt()
   2. input.nextDouble() for length → fixed to input.nextInt()
   3. Removed duplicate declaration of "box1"
   4. Changed "FixDebugBox" → corrected to "DebugBox"
   5. Replaced "box2.showVolume()" → now calls getVolume() method properly
*/
