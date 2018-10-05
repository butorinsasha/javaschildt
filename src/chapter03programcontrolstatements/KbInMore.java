package chapter03programcontrolstatements;

import java.io.IOException;
import java.util.Arrays;

public class KbInMore {
    public static void main(String[] args) throws IOException {
        char[] chArr;
        int maxNumsOfKeys = 11;
        byte[] bArr = new byte[maxNumsOfKeys];
        String str;
        int n; // numbers of bites actually read from keyboard NOT INCLUDING ENTER ITSELF;

        System.out.print("Input keys followed by ENTER: ");
        n = System.in.read(bArr) - 1; // get a number of bytes entered EXCLUDING ENTER;

        chArr = new char[n];

        for (int i = 0; i < n; i++) {
            chArr[i] = (char) bArr[i];
        }

//        chArr = str.toCharArray(); // WRONG: returns a string that "textually represents" this object == getClass().getName() + '@' + Integer.toHexString(hashCode())

        System.out.println("Max number of key you allowed to enter is: " + (maxNumsOfKeys-1) );
        System.out.println("Numbers of keys you actually entered is: " + n);


        System.out.print("Your ASCII key codes are: ");
        for (int i = 0; i < bArr.length; i++) {
            System.out.print(bArr[i] + " ");
        }
        System.out.println();


        System.out.print("Your keys are: ");
        for (int i = 0; i < chArr.length; i++) {
            System.out.print(chArr[i] + " ");
        }
        System.out.println();

        str = String.valueOf(chArr);
        System.out.println("String you entered is: " + str);

    }
}
