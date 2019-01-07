package book.chapter10usingio;

import java.io.*;

public class Ch10p347RWData {
    public static void main(String[] args) {
        int i = 256;
        int i1 = 0;
        try (DataOutputStream dataOut = new DataOutputStream(
                new FileOutputStream("testdata.txt", true)))
        {
            dataOut.writeBoolean(false); // 00000000
            dataOut.writeBoolean(false); // 00000000
            dataOut.writeBoolean(true);  // 00000001
            dataOut.writeBoolean(false); // 00000000
        } catch (IOException ioe) {
            System.out.println("Write error" + ioe);
            return;
        }

        System.out.println();

        try (DataInputStream dataIn = new DataInputStream(
                new FileInputStream("testdata.txt")))
        {
            i1 = dataIn.readInt();
        } catch (IOException ioe) {
            System.out.println("Read error" + ioe);
        }
        System.out.println(i + "==" + i1 + " is " + (i == i1));

    }
}
