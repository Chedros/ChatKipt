package sample.Server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
    public static void main(String[] args) throws IOException {
        new Main();
    }

    private Main() throws IOException {
        ServerSocket serverSocket = new ServerSocket(8000);
        System.out.println("Server start");
        while (true){
            Socket clientSocket = serverSocket.accept();
            System.out.println("Client accept");
            clientSocket.close();
        }

    }

}
