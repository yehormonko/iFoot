import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket socket = new ServerSocket(7777);
        Socket client = socket.accept();
        BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
        System.out.println(in.readLine());
    }
}
