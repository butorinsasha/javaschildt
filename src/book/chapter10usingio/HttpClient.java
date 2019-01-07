package book.chapter10usingio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class HttpClient {
//    public static final String HOST = "router.asus.com";
//    public static final int PORT = 80;

    public static final String HOST = "93.174.95.87"; // http://libgen.io
    public static final int PORT = 80;


    public static void main(String[] args) throws IOException {

        // Create A TCP socket and conect to the PORT:PORT
        Socket socket = new Socket(HOST, PORT);

        // Create input and output streams for the network socket
        BufferedReader in =
                new BufferedReader(
                        new InputStreamReader(socket.getInputStream()));
        PrintWriter out =
                new PrintWriter(socket.getOutputStream(), false);

        // Send request to the HTTP sever.
//        out.println("GET /Main_Login.asp HTTP/1.1");
        out.println("GET /foreignfiction HTTP/1.1");
        out.println("Host:" + HOST + ":" + PORT);
        out.println(); // blank line separating header and body
//        out.println("{body:\"Hello\"}");
        out.flush();

        // Read the response and display on console
        String line;
        // readLine() returns null in server close the network socket.
        while((line = in.readLine()) != null) {
            System.out.println(line);
        }

        //Close the I/O streams
        in.close();
        out.close();
    }
}
