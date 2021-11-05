package exercise4;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ReverseServer  {    
    private static final int PORT_NUMBER = 8765;

    public static void main(String[] args) {
        System.out.println("EchoServer running");

        ServerSocket server = null;
        try {
            // Obtain server socket
        	server = new ServerSocket(PORT_NUMBER);
            while (true) {
            	// Wait for connection
            	Socket socket = server.accept();
            	// Create new Runnable
            	Thread t = new Thread(new ReverseRunnable(socket));
            	// Pass the new Socket
            	// Start the Thread
            }
        } catch (IOException ex) {
            System.err.println("Unable to start server.");
        } finally {
        	// Close everything
        }
    }
}