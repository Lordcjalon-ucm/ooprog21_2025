import java.util.*;

public class DebugSeven4 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.println("Enter a String >> ");
        String text = kb.nextLine();

        int letters = 0;

        System.out.print("In all lowercase, the String is: ");
        for (int i = 0; i < text.length(); i++) {
            char ch = Character.toLowerCase(text.charAt(i));
            System.out.print(ch);
            if (Character.isLetter(ch)) letters++;
        }

        System.out.println();
        System.out.println("The number of CHARACTERS in the string is " + text.length());
        System.out.println("The number of LETTERS is " + letters);
    }
}
