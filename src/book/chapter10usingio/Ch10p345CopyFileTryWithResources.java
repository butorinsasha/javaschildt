/** Copy a text file.
 * To use this program, specify the name
 * of the source file and the destination file.
 * For example, to copy a file called from.txt
 * to a file called to.txt, use the following
 * command line.
 * java Ch10p345CopyFileTryWithResources from.txt to.txt
 */

package book.chapter10usingio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ch10p345CopyFileTryWithResources {
    public static void main(String[] args) {
        int i;
        // First, make sure that a file name has been specified
        if (args.length != 2) {
            System.out.println("Usages: CopyFile from-filename to-filename");
            return;
        }

        // Open and manage two files via the try statement.
        try (FileInputStream fin = new FileInputStream(args[0]);
             FileOutputStream fout = new FileOutputStream(args[1]))
        {
            do {
                i = fin.read();
                if (i != -1) fout.write(i);
            } while (i != -1);
        } catch (IOException ioe) {
            System.out.println("I/O Error: " + ioe);
        }
    }
}
