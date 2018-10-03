package chapter03programcontrolstatements;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;

public class KbIn {
    public static void main(String[] args) throws IOException {
        char ch;
        int i;
        System.out.print("Press a key followed by ENTER: ");
        i = System.in.read(); // get a char;
        ch = (char) i;
        System.out.println("Your key is: " + i);
        System.out.println("Your key is: " + ch);
    }
}
