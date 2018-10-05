package playground;

import usefull.MyInputStringReader;

import java.io.IOException;

public class MyInputStringReaderTest {
    public static void main(String[] args) throws IOException {

//        MyInputStringReader myStrReader1 = new MyInputStringReader(10);
        MyInputStringReader myStrReader2 = new MyInputStringReader();

//        System.out.print("Enter your string of max length 10 here: ");
//        String myStr1 = myStrReader1.readLine();
//        System.out.println("String you just entered: " + myStr1);
//
//        System.out.println();

        System.out.print("Enter your string of max length 10 here: ");
        String myStr2 = myStrReader2.readLine(10);
        System.out.println("String you just entered: " + myStr2);

    }
}
