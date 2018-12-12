/**
 * To run this programm from commant line with specified filename as argument^
 *
 * cd /javaschildt/out/production/javaschildt
 * java book.chapter10usingio.Ch10p344ShowFileTryWithResources test.txt
 *
 * test.txt must be it root directory which is javashildt/
 */

package book.chapter10usingio;

import java.io.FileInputStream;
import java.io.IOException;

public class Ch10p344ShowFileTryWithResources {
    public static void main(String[] args) {
        int i;

        // First, make sure that a file name has been specified
        if (args.length != 1) {
            System.out.println("Usage: java ShowFile filename");
            return;
        }

        // The following code uses try-with-resources to open a file
        // and then automatically close it when the try block is left.
        try (FileInputStream fin = new FileInputStream(args[0])) {
            do {
                i = fin.read();
                if (i != -1) {
                    System.out.print((char) i);
                }
                if (i == -1) {
                    System.out.print('\n');
                }
            } while (i != -1);
        } catch (IOException ioe) {
            System.out.println("I/O Error: " + ioe);
        }
    }
}
