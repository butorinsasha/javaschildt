package usefull;

import java.io.IOException;

public class MyInputStreamReader {

    /*Fields*/
    private int maxSize;


    /*Constructors*/

    /*Constructor by user defining of maxSize*/

    public MyInputStreamReader() {}
    public MyInputStreamReader(int maxSize) {
        this.maxSize = maxSize;
    }



    /*Methods*/
    public int getMaxSize() {
        return maxSize;
    }

    public String readLine(int s) throws IOException {
        maxSize = s;

        byte[] bytes = new byte[s+1]; // extra byte for ENTER char
        int n;
        char[] chars;
        String str;

        n = System.in.read(bytes, 0, s+1);

        chars = new char[n-1]; //exclude an ENTER char

        for (int i = 0; i < chars.length; i++) {
            chars[i] = (char) bytes[i];
        }

        str = String.valueOf(chars);

        return str;
    }

    public String readLine() throws IOException {
        return this.readLine(this.maxSize);
    }
}
