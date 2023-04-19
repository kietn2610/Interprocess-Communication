import java.net.*;
import java.io.*;

public class QuoteServer {
    public static void main(String[] args) {
        try {
            ServerSocket sock = new ServerSocket(6017);
            long startTime = System.currentTimeMillis();

            /* now listen for connections */
            while (true) {
                System.out.println("Waiting for Client Connection");
                Socket client = sock.accept();
                System.out.println("Client Connected");

                // talk to server here
                // sets up a PrintWriter for data to be sent to client.
                PrintWriter pout = new PrintWriter(client.getOutputStream(), true);

                /* write the Date to the socket */
                pout.println("Don't get hung up on mistake, grow past them.");
                /* close the socket and resume */
                /* listening for connections   */
                client.close();
                System.out.println("client.isClosed(): " + client.isClosed());
                System.out.println("Client Closed Successfully\n");

                // calculate runtime in seconds
                long elapsedTime = System.currentTimeMillis() - startTime;
                double seconds = (double) elapsedTime / 1000.0;
                System.out.println("Run Time is " + seconds + " seconds.");
                break;
            }

        } catch (IOException ioe) {
            System.err.println(ioe);
        }
    }
}
