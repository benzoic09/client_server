import java.io.*;
import java.net.*;

public class client {
    public static void main(String[] args) {

        try {
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Enter server IP: ");
            String host = input.readLine();

            int port = 1234;

            Socket socket = new Socket(host, port);

            BufferedReader serverIn = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(
                    socket.getOutputStream(), true);

            System.out.println("Connected to server");

            // Show commands
            System.out.println("\nAvailable Commands:");
            System.out.println("ADD a b | SUB a b | MUL a b | DIV a b");
            System.out.println("REVERSE text | UPPER text | WORDCOUNT text\n");

            // Thread to receive messages
            new Thread(() -> {
                String msg;
                try {
                    while ((msg = serverIn.readLine()) != null) {
                        System.out.println("Server: " + msg);
                    }
                } catch (IOException e) {
                    System.out.println("Server timeout or disconnected");
                }
            }).start();

            // Send messages
            String userInput;
            while ((userInput = input.readLine()) != null) {
                out.println(userInput);
            }

        } catch (IOException e) {
            System.out.println("Could not connect to server");
        }
    }
}