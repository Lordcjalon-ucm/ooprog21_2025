import java.util.*;

public class DebugSeven3 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter a famous quote >> ");
        String quote = kb.nextLine();

        System.out.print("Enter a character to search for >> ");
        char search = kb.next().charAt(0);

        System.out.println("indexOf('" + search + "') is: " + quote.indexOf(search));
        System.out.println("indexOf('a') is: " + quote.indexOf('a'));
        System.out.println("indexOf('x') is: " + quote.indexOf('x'));

        if (quote.length() > 5)
            System.out.println("charAt(5) is: " + quote.charAt(5));

        System.out.println("replace('e', '*') is: " + quote.replace('e', '*'));
    }
}
