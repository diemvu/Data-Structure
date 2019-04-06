import java.io.File;
import java.util.Scanner;

/**
 * 
 * @author Diem Vu
 * @version winter 2019
 */
public final class Main {

    /**
     */
    private Main() {

    }

    /**
     * 
     * @param theArgs argument
     */
    public static void main(final String[] theArgs) { // PMD theArgs is already
                                                      // declared final
        System.out.println("Please enter the file name with extension.");
        final Scanner scanner = new Scanner(System.in); // PMD scanner is already
                                                        // declared final
        final String fileName = scanner.next();
        System.out.println("Please enter the number of word you want to display.");
        final int n = scanner.nextInt();
        final WordCount wordCount = new WordCount();
        wordCount.topFrequency(n, fileName);
        scanner.close();

    }

}
