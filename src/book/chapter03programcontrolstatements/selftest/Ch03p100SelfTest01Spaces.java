package book.chapter03programcontrolstatements.selftest;

import java.io.IOException;

public class Ch03p100SelfTest01Spaces {
    public static void main(String[] args) throws IOException {
        int spaces = 0;
        char ch;

        System.out.println("Enter a period to stop");
        do {
            ch = (char) System.in.read();
            if (ch == ' ') spaces++;
        } while (ch != '.');
        System.out.println("Spaces: " + spaces);
    }
}
