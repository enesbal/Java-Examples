package SimpleGui;

import javax.swing.*;
import java.awt.*;

/**
 * Created by enes on 11/15/2017.
 */

class Slice{
    double value;
    Color color;
    public Slice(double value, Color color){
        this.value=value;
        this.color = color;
    }
}

class MyComponent extends JComponent{
    Slice[] slice = {
            new Slice(5,Color.black), new Slice(33,Color.green), new Slice(20, Color.yellow), new Slice(15,Color.red)
    };
    MyComponent(){}
    public  void paint(Graphics g){
        drawPie((Graphics2D) g,getBounds(),slice);
    }
    void drawPie(Graphics2D g, Rectangle area, Slice[] slice){
        double total = 0.0D;
        int startAngle=0;
        for(int i=0; i <slice.length ; i++){
            total+=slice[i].value;
        }
        double curValue = 0.0D;
        for (int i =0; i<slice.length;i++){
            startAngle = (int) (curValue*360/total);
            int arcAngle= (int) (slice[i].value*360/total);
            g.setColor(slice[i].color);
            g.fillArc(area.x, area.y, area.width, area.height, startAngle, arcAngle);
            curValue += slice[i].value;
        }
    }
}


public class DisplayAPieChart {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.getContentPane().add(new MyComponent());
        frame.setSize(300,200);
        frame.setVisible(true);
    }
}
