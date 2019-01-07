/**
 * To run this program from command line with specified filename as argument^
 *
 * cd /javaschildt/out/production/javaschildt
 * java book.chapter10usingio.Ch10p339ShowFile test.txt
 *
 * test.txt must be it root directory which is javashildt/
 */

package book.chapter10usingio;

import java.io.FileInputStream;
import java.io.IOException;

public class Ch10p339ShowFile {
    public static void main(String[] args) {
        int i;
        FileInputStream fin = null; // fin is initialize to null;

        // First, confirm that a file name has been specified.
        if (args.length != 1) {
            System.out.println("Usage: ShowFile filename");
            return; // to the end of main()
        }


        // The following code opens a file, reads characters until EOF
        // is encountered, and then closes the file via a finally block.
        try {
            fin = new FileInputStream(args[0]);

            do {
                i = fin.read();
                if (i != -1) System.out.print((char) i);
            } while (i != -1);
            System.out.println('\n');

        } catch (IOException ioe) {
            System.out.println("I/O Error: " + ioe);
        }
        finally {
            // Close file in all cases.
            try {
                if(fin != null) fin.close(); // Close fin only if it is not null
            } catch (IOException e) {
                System.out.println("Error closing the file");;
            }
        }
    }
}

