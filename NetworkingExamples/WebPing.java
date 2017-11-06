package NetworkingExamples;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

/**
 * Created by enes on 11/7/2017.
 */
public class WebPing {
    public static void main(String[] args) {
        InetAddress addr;
        try {
            Socket sock = new Socket("www.enesbal.github.io",80);
            addr = sock.getInetAddress();
            System.out.println("Connected to "+ addr);
            sock.close();
        } catch (IOException e) {
            System.out.println("Can't connect to " + args[0]);
            System.out.println(e);
            e.printStackTrace();
        }
    }
}
