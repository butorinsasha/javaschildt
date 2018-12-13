// Read a string from console using a BufferedReader.

package book.chapter10usingio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ch10p356ReadLines {
    public static void main(String[] args) throws IOException {

        String str;

        // How to instanciate BufferedReader object bf
        // that is linked to the cosole through System.in
        BufferedReader br = new
                BufferedReader(new
                    InputStreamReader(System.in));

        System.out.println("Enter lines of text.");
        System.out.println("Enter 'stop' to quit");

        do {
            str = br.readLine();
            System.out.println(str);
        } while (!str.equals("stop"));

    }
}
