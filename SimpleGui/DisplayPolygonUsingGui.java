package SimpleGui;

import sun.plugin2.ipc.windows.WindowsEvent;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;

/**
 * Created by enes on 11/12/2017.
 */
public class DisplayPolygonUsingGui extends JPanel {
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Polygon p = new Polygon();
        for(int i=0; i< 5; i++) p.addPoint(
                (int)(100+50*Math.cos(i*2*Math.PI/5)),
                (int)(100+50*Math.sin(i*2*Math.PI/5)));
        g.drawPolygon(p);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Polygon");
        frame.setSize(350,250);

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowsEvent e){
                System.exit(0);
            }
        });

        Container contentPane = frame.getContentPane();
        contentPane.add(new DisplayPolygonUsingGui());
        frame.setVisible(true);
    }
}
