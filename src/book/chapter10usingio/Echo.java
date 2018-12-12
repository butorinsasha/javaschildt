package book.chapter10usingio;

import java.io.IOException;

public class Echo {
    public static void main(String[] args) {
        int i;
        try {
            do {
                i = System.in.read();
                if (i != -1) System.out.print((char) i);
            } while (i != -1);
        } catch (IOException ioe) {
            System.out.println("IOException: " + ioe);
        }
    }
}
