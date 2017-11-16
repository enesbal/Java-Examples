package SimpleGui;

import javax.swing.*;
import java.awt.*;

/**
 * Created by enes on 11/16/2017.
 */
public class DrawTextUsingGui extends JPanel {
    public void paint(Graphics g){
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);

        Font font = new Font("Serif", Font.PLAIN,96);
        g2.setFont(font);
        g2.drawString("Text",40,120);
    }

    public static void main(String[] args){
        JFrame f = new JFrame();
        f.getContentPane().add(new DrawTextUsingGui());
        f.setSize(300,200);
        f.setVisible(true);
    }
}
