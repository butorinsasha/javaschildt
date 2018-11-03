package book.chapter03programcontrolstatements;

import java.io.IOException;

public class Guess3 {
    public static void main(String[] args) throws IOException {
        char ch, answer = 'K';

        System.out.println("I'm thinking of letter between A and Z.");
        System.out.print("Can you guess it: ");
        ch = (char) System.in.read(); // read char frin the keyboard
        if (ch == answer) System.out.println("** Right **");
        else {
            System.out.print("...Sorry, you'are ");
            // a nested if
            if (ch < answer) System.out.println("too low");
            else System.out.println("too high");
        }
    }
}
