
package program;

import java.util.Scanner;

/**
 * 
 * @author Diem Vu
 * @version 1.0
 */
public final class Main {
    /**
     * 
     */
    private Main() {

    }

    /**
     * this method convert input from console to binary.
     */
    public static void convertNumbertoBinary() {

        final Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a decimal number ");
        System.out.println("Enter Quit if you want to stop the program");
        while (scanner.hasNext()) {
            final String s = scanner.next();
            try {
                final int n = Integer.parseInt(s);
                System.out.println("The binary representation of " + n + " is: "
                                   + StackUtilities.decimalToBinary(n));
            } catch (final Exception e) {
                if (s.contentEquals("Quit")) {
                    scanner.close();
                    System.exit(-1);
                }
                System.out.println("The value entered is not an integer");
            }
        }
    }

    /**
     * @param theArgs argument.
     */
    public static void main(final String[] theArgs) {
        convertNumbertoBinary();
    }
}
