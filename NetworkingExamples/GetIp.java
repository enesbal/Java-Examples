package NetworkingExamples;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by enes on 11/7/2017.
 */
public class GetIp {
    public static void main(String[] args) {
        InetAddress address = null;
        try {
            address = InetAddress.getByName("wwww.enesbal.github.io");
        } catch (UnknownHostException e) {
            e.printStackTrace();
            System.exit(2);
        }
        System.out.println(address.getHostName() + "= " + address.getHostAddress());
        System.exit(0);
    }
}
