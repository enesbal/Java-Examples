package NetworkingExamples;

import java.io.IOException;
import java.net.*;
import java.util.Properties;

/**
 * Created by enes on 11/9/2017.
 */
public class FindProxySettings {
    public static void main(String[] args) throws IOException, URISyntaxException {
        Properties systemSettings = System.getProperties();
        systemSettings.put("proxySet","true");
        systemSettings.put("http.proxyHost","proxy.mycompany1.local");
        systemSettings.put("http.proxyPort","80");

        URL u = new URL("http://www.google.com");
        HttpURLConnection con = (HttpURLConnection) u.openConnection();
        System.out.println(con.getResponseCode() + " : " + con.getResponseMessage());
        System.out.println(con.getResponseCode() == HttpURLConnection.HTTP_OK);

        System.setProperty("java.net.useSystemProxies","true");
        Proxy proxy = ProxySelector.getDefault().select(new URI(
                "http://www.yahoo.com")).iterator().next();

        System.out.println("proxy hostname : " + proxy.type());
        InetSocketAddress addr = (InetSocketAddress) proxy.address();

        if(addr == null){
            System.out.println("No proxy");
        }else{
            System.out.println("proxy hostname : " + addr.getHostName());
            System.out.println("proxy port : " + addr.getPort());
        }

    }
}
