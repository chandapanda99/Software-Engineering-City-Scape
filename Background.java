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
 
        RectangleComponent ground = new RectangleComponent(0, 500, 2147483647, 50, 16, 79, 0);
        frame.add(ground);
        frame.setVisible(true);
       
        RectangleComponent building1 = new RectangleComponent(20, 500, 20, 35, 134, 219, 59);
        frame.add(building1);
        frame.setVisible(true);
        
        RectangleComponent building2 = new RectangleComponent(45, 500, 20, 35, 134, 219, 59);
        frame.add(building2);
        frame.setVisible(true);
       
        RectangleComponent building3 = new RectangleComponent(70, 500, 20, 35, 134, 219, 59);
        frame.add(building3);
        frame.setVisible(true);
        
        RectangleComponent building4 = new RectangleComponent(95, 500, 20, 35, 134, 219, 59);
        frame.add(building4);
        frame.setVisible(true);
       
        RectangleComponent building5 = new RectangleComponent(120, 500, 20, 35, 134, 219, 59);
        frame.add(building5);
        frame.setVisible(true);
    }
}