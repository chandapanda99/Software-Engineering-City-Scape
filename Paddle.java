/**
 * Write a description of class Paddle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Paddle extends JComponent implements KeyListener
{
    int dy, x, y, width, height;
    
    public Paddle()
    {
        dy = 0;
        x = 1200;
        y = 200;
        width = 10;
        height = 100;
    }
    
     public void update(Pong p, Ball b, KeyEvent e)
    {
        checkForCollision(b);
        keyPressed(e);
    }
    
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.RED);
        g2.fillRect(x, y, width, height);
    }
    
    public void keyPressed(KeyEvent e)
    {
        int key = e.getKeyCode();
        if (key == KeyEvent.VK_UP)
        {
            dy = 10;
            y += dy;
        }
        else if (key == KeyEvent.VK_DOWN)
        {
            dy = -10;
            y += dy;
        }
    }
    
    public void keyReleased(KeyEvent e)
    {
        int key = e.getKeyCode();
        if (key == KeyEvent.VK_UP)
        {
            dy = 0;
        }
        else if(key == KeyEvent.VK_DOWN)
        {
            dy = 0;
        }
    }
    
    public void keyTyped(KeyEvent e)
    {
    }
    
    private void checkForCollision(Ball b)
    {
        int ballx = b.getX();
        int bally = b.getY();
        int radius = b.getRadius();
        
        if (ballx + radius > x && ballx + radius < x + height)
        {
            double newDx = b.getDx() * -1;
            b.setDx(newDx);
        }
    }
}