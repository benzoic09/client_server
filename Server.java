import java.io.*;
import java.net.*;

public class server {

    public static void main(String[] args) {
        int port = 1234;

        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Server started... Waiting for client");

            Socket socket = serverSocket.accept();
            System.out.println("Client connected");

            BufferedReader in = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(
                    socket.getOutputStream(), true);

            // Thread to read and process client requests
            new Thread(() -> {
                String msg;
                try {
                    while ((msg = in.readLine()) != null) {
                        System.out.println("Client: " + msg);

                        String response = processRequest(msg);
                        out.println(response);
                    }
                } catch (IOException e) {
                    System.out.println("Client disconnected");
                }
            }).start();

            // Keep server alive
            while (true) {
                // do nothing, just keep main thread running
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //  Computation  method
    private static String processRequest(String request) {
        String[] parts = request.split(" ");
        String command = parts[0];

        try {
            switch (command) {
                case "ADD":
                    return "RESULT " + (Integer.parseInt(parts[1]) + Integer.parseInt(parts[2]));

                case "SUB":
                    return "RESULT " + (Integer.parseInt(parts[1]) - Integer.parseInt(parts[2]));

                case "MUL":
                    return "RESULT " + (Integer.parseInt(parts[1]) * Integer.parseInt(parts[2]));

                case "DIV":
                    int b = Integer.parseInt(parts[2]);
                    if (b == 0) return "ERROR Division by zero";
                    return "RESULT " + (Integer.parseInt(parts[1]) / b);

                case "REVERSE":
                    return "RESULT " + new StringBuilder(parts[1]).reverse().toString();

                case "UPPER":
                    return "RESULT " + parts[1].toUpperCase();

                case "WORDCOUNT":
                    return "RESULT " + request.substring(request.indexOf(" ") + 1).split(" ").length;

                default:
                    return "ERROR Unknown command";
            }
        } catch (Exception e) {
            return "ERROR Invalid input";
        }
    }
}