package book.chapter10usingio;

import java.io.IOException;

public class Ch10p335ReadBytes {
    public static void main(String[] args) throws IOException {
        byte data[] = new byte[10]        ;

        System.out.println("Enter some characters");
        System.in.read(data);
        System.out.println(System.in.getClass());
        System.out.println(System.out.getClass());
        System.out.print("You entered: ");
        for (int i = 0; i < data.length; i++) {
            System.out.print((char) data[i]);
        }
    }
}
