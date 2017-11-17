package SimpleGui;

import javax.swing.*;
import java.awt.*;

/**
 * Created by enes on 11/17/2017.
 */
public class CheckStatusOfAntiAlising {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.add(new MyComponent());
        frame.setSize(300,300);
        frame.setVisible(true);
    }

    static class MyComponent extends JComponent{
        public void paint (Graphics g ){
            Graphics2D g2 = (Graphics2D) g;
            RenderingHints rh = g2.getRenderingHints();
            boolean bl = rh.containsValue(RenderingHints.VALUE_ANTIALIAS_ON);
            System.out.println(bl);
            g2.setRenderingHint(
                    RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON
            );
        }
    }

}
