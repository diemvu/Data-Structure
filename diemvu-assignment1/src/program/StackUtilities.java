
package program;

import structures.ArrayStack;

/**
 * @author Diem Vu
 * @version 1.0
 */
public class StackUtilities {
    /**
     * @param theDecimal a decimal number user want to tranform to binary
     * @return String represention of a decimal number
     */
    public static String decimalToBinary(final int theDecimal) {
        int n = theDecimal;
        final ArrayStack<Integer> stack = new ArrayStack<>();

        String s = "";
        if (n <= 0) {
            s = "Can't convert a nonpositive integer";
        } else {
            while (n > 0) {
                stack.push(n % 2);
                n = n / 2;
            }
            s = stack.toString().replaceAll("\n", "");
        }
        return s;
    }
}
