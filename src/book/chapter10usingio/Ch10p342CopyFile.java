/** Copy a text file.
 * To use this program, specify the name
 * of the source file and the destination file.
 * For example, to copy a file called from.txt
 * to a file called to.txt, use the following
 * command line.
 * java Ch10p342CopyFile from.txt to.txt
 */

package book.chapter10usingio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ch10p342CopyFile {
    public static void main(String[] args) {
        int i;
        FileInputStream fin = null;
        FileOutputStream fout = null;

        // First, make sure that both files has been specified in args[]
        if (args.length !=2) {
            System.out.println("Usage: java CopyFile from-filename to-filename");
            return;
        }

        // Copy a file
        try {
            // copy from fin to fout code

            fin = new FileInputStream(args[0]);
            fout = new FileOutputStream(args[1], false);

            do {
                i = fin.read();
                if (i != -1) {
                    fout.write(i);
                }
                if (i == -1) {
                    fout.write((int) '\n');
                }
            } while (i != -1);

        } catch (IOException ioe) {
            System.out.println("I/O Error: " + ioe);
        } finally {
            try {
                // close fin code
                if (fin !=null) fin.close();
            } catch (IOException ioe) {
                System.out.println("Error closing Input file: " + ioe);
            }

            try {
                // close fout code
                if (fout != null) fout.close();
            } catch (IOException ioe) {
                System.out.println("Error closing Output file");
            }
        }
    }
}
