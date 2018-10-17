package playground;

import usefull.MyInputStreamReader;

import java.io.IOException;

public class MyInputStreamReaderTest {
    public static void main(String[] args) throws IOException {

//        MyInputStreamReader myStrReader1 = new MyInputStreamReader(10);
        MyInputStreamReader myStrReader2 = new MyInputStreamReader();

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
