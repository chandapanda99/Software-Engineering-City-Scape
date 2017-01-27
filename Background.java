import javax.swing.JFrame;
import java.awt.*;

public class Background
{
    public static void main(String[] args) throws InterruptedException
    {
        JFrame frame = new JFrame();
 
        frame.setSize(1710, 910);
        frame.setTitle("PONG!");
        frame.getContentPane().setBackground(Color.CYAN);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        RectangleComponent building1 = new RectangleComponent(98, 250, 65, 35, 0, 0, 0);
        frame.add(building1);
        frame.setVisible(true);
        
        RectangleComponent building2 = new RectangleComponent(310, 250, 73, 35, 255, 0, 255);
        frame.add(building2);
        frame.setVisible(true);
       
        RectangleComponent building3 = new RectangleComponent(700, 250, 76, 35, 233, 221, 231);
        frame.add(building3);
        frame.setVisible(true);
        
        RectangleComponent building4 = new RectangleComponent(899, 250, 58, 35, 244, 123, 212);
        frame.add(building4);
        frame.setVisible(true);
       
        RectangleComponent building5 = new RectangleComponent(1199, 250, 82, 35, 222, 222, 123);
        frame.add(building5);
        frame.setVisible(true);
        
        RectangleComponent ground = new RectangleComponent(0, 500, 2147483647, 50, 16, 79, 0);
        frame.add(ground);
        frame.setVisible(true);
    }
}