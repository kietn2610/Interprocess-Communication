import java.net.*;
import java.io.*;


public class QuoteClient {

    public static void main(String[] args) throws IOException {
        try{
            // creating a client socket
            Socket socket = new Socket("localhost", 6017);
            System.out.println("Connected to server");

            // this will be used to receive the message from the QuoteServer
            InputStreamReader serverMessages = new InputStreamReader(socket.getInputStream());
            BufferedReader bf = new BufferedReader(serverMessages);

            // print out the incoming echo from the server
            System.out.println("Quote received: " + bf.readLine());
        }
        catch (Exception e){
            throw e;
        }
    }
}