package NetworkingExamples;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created by enes on 11/7/2017.
 */
public class FileModificationTime {
    public static void main(String[] args) {
        try {
            URL u = new URL("http://127.0.0.1/java.bmp");
            URLConnection uc = u.openConnection();
            uc.setUseCaches(false);
            long timestamp = uc.getLastModified();
            System.out.println("The last modification of java.bmp is:" + timestamp);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
