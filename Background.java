import javax.swing.JFrame;
import java.awt.*;

public class Background
{
    public static void main(String[] args) throws InterruptedException
    {
        JFrame frame = new JFrame();
        Paddle pad = new Paddle();
        
        frame.setSize(1710, 910);
        frame.setTitle("PONG!");
        frame.getContentPane().setBackground(Color.CYAN);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(pad);
        
        pad.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("UP"), "move up");
        pad.getActionMap().put("move up", new MoveY(-1));
        
        
        RectangleComponent building1 = new RectangleComponent(98, 90, 50, 410, 0, 0, 0);
        frame.add(building1);
        frame.setVisible(true);
        
        RectangleComponent building2 = new RectangleComponent(310, 95, 50, 405, 255, 0, 255);
        frame.add(building2);
        frame.setVisible(true);
       
        RectangleComponent building3 = new RectangleComponent(700, 380, 50, 120, 233, 221, 231);
        frame.add(building3);
        frame.setVisible(true);
        
        RectangleComponent building4 = new RectangleComponent(899, 80, 50, 420, 244, 123, 212);
        frame.add(building4);
        frame.setVisible(true);
       
        RectangleComponent building5 = new RectangleComponent(1199, 2, 50, 498, 222, 222, 123);
        frame.add(building5);
        frame.setVisible(true);
        
        RectangleComponent ground = new RectangleComponent(0, 500, 2147483647, 214, 16, 79, 0);
        frame.add(ground);
        frame.setVisible(true);
    }
}