// A simple disk-to-screen utilitiy that demonstrates a FileReader.
package book.chapter10usingio;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ch10p359DiskToScreen {
    public static void main(String[] args) {
        String str;

        // Create and use a FileReader wrapped in a BufferedReader.
        try (BufferedReader br =
                     new BufferedReader(
                             new FileReader(args[0]))) {
            while ((str = br.readLine()) != null) {
                System.out.println(str);
            }
        } catch (IOException ioe) {
            System.out.println("I/O Error: " + ioe);
        }

    }
}
