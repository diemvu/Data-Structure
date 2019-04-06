
package applications;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;
import structures.LinkedOutputRestrictedDeque;

/**
 * @author Diem Vu
 * @version Winter 2018.
 */
public final class RadixSortDemo {
    /**
     * there are 10 digits from 0 to 9.
     */
    private static final int NUMBER_OF_DIGIT = 10;

    /**
     * 
     */
    private RadixSortDemo() {

    }

    /**
     * 
     * @param <T>
     * @param theQueue a Queue of unosorted Integer
     * @return an sorted queue of IntegerF
     * 
     */
    public static LinkedOutputRestrictedDeque<Integer> radixSort(final LinkedOutputRestrictedDeque<Integer> theQueue) {

        @SuppressWarnings("unchecked")
        final LinkedOutputRestrictedDeque<Integer>[] digits =
                        new LinkedOutputRestrictedDeque[NUMBER_OF_DIGIT];
        for (int k = 0; k < NUMBER_OF_DIGIT; k++) {
            digits[k] = new LinkedOutputRestrictedDeque<Integer>();
        }

        final int size = theQueue.size();
        int i = 0;
        boolean unsorted = true;
        while (unsorted) {

            while (theQueue.size() != 0) {
                final Integer current = theQueue.dequeue();
                final Integer temp = current / ((int) Math.pow(10, i));
                digits[temp % NUMBER_OF_DIGIT].enqueue(current);
            }
            i++;
            if (digits[0].size() == size) {
                unsorted = false;
            }
            for (int j = 0; j < NUMBER_OF_DIGIT; j++) {
                while (!digits[j].isEmpty()) {
                    theQueue.enqueue(digits[j].dequeue());
                }
            }
        }
        return theQueue;
    }

    /**
     * 
     */
    private static void writeSortedFile() {
        final Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the input file name. Enter q/Q if you want to quit");
        while (scanner.hasNext()) {
            final String fileName = scanner.nextLine();
            if ("q".equalsIgnoreCase(fileName)) {
                System.out.println("You have quit the program. Bye");
                scanner.close();
                System.exit(1);
                break;
            }
            final LinkedOutputRestrictedDeque<Integer> inputQueue =
                            new LinkedOutputRestrictedDeque<Integer>();

            try {
                final Scanner scanner2 = new Scanner(new File(fileName));
                while (scanner2.hasNext()) {
                    try {
                        final int i = scanner2.nextInt();
                        inputQueue.enqueue(i);
                    } catch (final Exception e) {
                        System.out.println("The file has non- Integer value.");
                        System.out.println("The output file will only print out "
                                           + "a part of the file up to the non Integer value");
                        System.out.println(".......");

                        break;
                    }
                }
                scanner2.close();

                final PrintStream output = new PrintStream(new File("output"));
                final LinkedOutputRestrictedDeque<Integer> outputQueue = radixSort(inputQueue);
                while (!outputQueue.isEmpty()) {
                    output.println(outputQueue.dequeue());
                }
                System.out.print("Finish printing out output file.");
                System.out.println(" Please check project to see the output file");
            } catch (final FileNotFoundException e) {
                System.out.println("File not found.");

            }
            System.out.println("Please enter another file name or q/Q if you want to quit");

        }

        scanner.close();
    }

    /**
     * @param theArgs string array of argument.
     */
    public static void main(final String[] theArgs) {
        writeSortedFile();

        // System.out.println(myQueue);
        // System.out.println(radixSort(myQueue));
    }

}
