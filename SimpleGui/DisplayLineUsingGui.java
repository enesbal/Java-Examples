package SimpleGui;

import sun.plugin2.ipc.windows.WindowsEvent;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.geom.Line2D;

/**
 * Created by enes on 11/11/2017.
 */
public class DisplayLineUsingGui  extends JApplet{
    public void init(){
        setBackground(Color.white);
        setForeground(Color.white);
    }

    public void paint(Graphics g){
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setPaint(Color.gray);
        int x =5;
        int y = 7;
        g2.draw(new Line2D.Double(x,y,200,200));
        g2.drawString("Line", x , 250);
    }

    public static void main(String[] args) {
        JFrame f = new JFrame("Line");
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowsEvent e){
                System.exit(0);
            }
        });

        JApplet applet = new DisplayLineUsingGui();
        f.getContentPane().add("Center", applet);
        applet.init();

        f.pack();
        f.setSize(new Dimension(300,300));
        f.setVisible(true);
    }
}
