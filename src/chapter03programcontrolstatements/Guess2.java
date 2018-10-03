package chapter03programcontrolstatements;

import java.io.IOException;

public class Guess2 {
    public static void main(String[] args) throws IOException {
        char ch, answer = 'K';

        System.out.println("I'm thinking of letter between A and Z.");
        System.out.print("Can you guess it: ");
        ch = (char) System.in.read(); // read char frin the keyboard
        if (ch == answer) System.out.println("** Right **");
        else System.out.println("...Sorry, you'are wrong.");
    }
}
