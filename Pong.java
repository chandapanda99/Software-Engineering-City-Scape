/**
 * A remake of the popular hit game "Pong"
 * 
 * Aayush Chanda
 * Pong
 */
import java.util.*;
import java.applet.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Pong extends JApplet implements Runnable
{
    Paddle pad;
    Ball b;
    KeyEvent e;
    private Image i;
    private Graphics doubleG;
    int width = 600;
    int height = 600;
    private Graphics g;
    
    public void Pong()
    {
    }
    
    public void init()
    {
        setSize(width, height);
        setVisible(true);
    }
    
    public void start()
    {
        b = new Ball(50, 50);
        pad = new Paddle();
        Thread thread = new Thread(this);
        thread.start();
    }
    
    public void run()
    {
        while(true)
        {
            b.update(this);
            pad.update(this, b, e);
            repaint();
            try
            {
                Thread.sleep(25);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
    
    public void stop()
    {
    }
    
    public void destroy()
    {
    }
    
    public void update(Graphics g)
    {
        if (i == null)
        {
            i = createImage(this.getSize().width, this.getSize().height);
            doubleG = i.getGraphics();
        }
        doubleG.setColor(getBackground());
        doubleG.fillRect(0, 0, this.getSize().width, this.getSize().height);
        doubleG.setColor(getForeground());
        paint(doubleG);
        
        g.drawImage(i, 0, 0, this);
    }
    
    public void paint(Graphics g)
    {
        b.paint(g);
        pad.paint(g);
    }
}
