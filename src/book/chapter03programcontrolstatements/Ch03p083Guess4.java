package book.chapter03programcontrolstatements;

import java.io.IOException;

public class Ch03p083Guess4 {
    public static void main(String[] args) throws IOException {
        char ch, ignore, answer = 'k';

        do {
            System.out.println("I'm tinking of a letter between s and z.");
            System.out.println("Can you guess in: ");

            // read a character
            ch = (char) System.in.read();

            // discard any other character in the input buffer
            /*
            Continuing to read input until the end of  the line is reached.
            If they were not discarded, then those characters would also be sent to the program as guessses, which is not what is wanted
            */
            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');

            if (ch == answer) System.out.println("*** Right ***");
            else {
                System.out.println("...Sorry, you're ");
                if (ch < answer) System.out.println("too low");
                else System.out.println("too high");
                System.out.println("Try again");
            }

        } while (answer != ch);
    }
}
