// Use a BufferedReader to read characters from the console.

package book.chapter10usingio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ch10p355ReadChars {
    public static void main(String[] args) throws IOException {
        char ch;

        // How to instantiate BufferedReader object bf
        // that is linked to the console through System.in
        BufferedReader br =
                new BufferedReader(
                    new InputStreamReader(System.in));

        System.out.println("Enter characters, period to quit");

        // Read characters
        do {
            ch = (char) br.read();
            System.out.println(ch);
        } while (ch != '.');
    }
}
