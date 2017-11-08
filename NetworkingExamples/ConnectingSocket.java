package NetworkingExamples;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by enes on 11/9/2017.
 */
public class ConnectingSocket {
    public static void main(String[] args) throws IOException {
        while (true) {
            ServerSocket server = new ServerSocket(6123);
            while (true) {
                System.out.println("Listening");
                Socket sock = server.accept();
                InetAddress addr = sock.getInetAddress();
                System.out.println("Connection made to " + addr.getHostName() +
                " (" + addr.getHostAddress() + ")");
                pause(5000);
                sock.close();
            }
        }
    }

    private static void pause(int ms){
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
