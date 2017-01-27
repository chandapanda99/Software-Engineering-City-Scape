/**
 * Write a description of class Paddle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.awt.*;
import java.awt.event.*;
public class Paddle implements KeyListener
{
    int dy, x, y, width, height;
    
    public Paddle()
    {
        dy = 10;
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
    
    public void paint(Graphics g)
    {
        g.setColor(Color.RED);
        g.fillRect(x, y, width, height);
    }
    
    public void keyPressed(KeyEvent e)
    {
        int key = e.getKeyCode();
        switch(key) 
        {
            case KeyEvent.VK_UP:
                y += dy;
                break;
            case KeyEvent.VK_DOWN:
                y -= dy;
                break;
        }
    }
    
    public void keyReleased(KeyEvent e)
    {
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