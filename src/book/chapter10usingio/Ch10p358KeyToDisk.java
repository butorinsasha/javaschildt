// A simple key-to-disk utility that demonstrates a FileWriter.

package book.chapter10usingio;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ch10p358KeyToDisk {
    public static void main(String[] args) {
        String str;

        BufferedReader br =
                new BufferedReader(
                        new InputStreamReader(System.in));

        System.out.println("Enter text ('stop' to quit).");

        try (FileWriter fw = new FileWriter(args[0])) {
            do {
                str = br.readLine();
                if (str.compareTo("stop") == 0) {
                    break;
                }
                str = str + "\r\n";
                fw.write(str);
            } while (str.compareTo("stop") != 0);
        } catch (IOException ioe) {
            System.out.println("I/O Error: " + ioe);
        }
    }
}
