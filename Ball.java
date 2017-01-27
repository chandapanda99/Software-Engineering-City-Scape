/**
 * Write a description of class Ball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
import java.applet.*;
import java.awt.*;
import javax.swing.*;
public class Ball
{
    int x;
    int y;
    Random generator = new Random();
    private double dx = 15;
    private double dy = 15;
    private int radius = 20;
    Pong p;
    
    public Ball(int a, int b)
    {
        x = a;
        y = b;
    }
    
    public void update(Pong p)
    {
        while (true)
        {
            if (x + dx > p.getWidth() - radius - 1)
            {
                x = p.getWidth() - (radius - 1);
                dx = -dx;
            }
            else if (x + dx < 0 + radius)
            {
                x = 0 + radius;
                dx = -dx;
            }
            else
            {
                x += dx;
            }
            
            if (y > p.getHeight() - (radius - 1))
            {
                y = p.getHeight() - (radius - 1);
                dy = -dy;
            }
            else if (y + dy < 0 + radius)
            {
                y = radius;
                dy = -dy;
            }
            else
            {
                y += dy;
            }
        }
    }
    
    public void paint(Graphics g)
    {
        g.setColor(new Color(generator.nextInt(256), generator.nextInt(256), generator.nextInt(256)));
        g.fillOval(x - radius, y - radius, radius * 2, radius * 2);
    }
    
    public int getX()
    {
        return x;
    }
    
    public void setX(int x)
    {
        this.x = x;
    }
    
    public int getY()
    {
        return y;
    }
    
    public void setY(int y)
    {
        this.y = y;
    }
    
    public double getDx()
    {
        return dx;
    }
    
    public void setDx(double Dx)
    {
        this.dx = dx;
    }
    
    public double getDy()
    {
        return dy;
    }
    
    public void setDy(double Dy)
    {
        this.dy = dy;
    }
    
    public int getRadius()
    {
        return radius;
    }
    
    public void setRadius(int radius)
    {
        this.radius = radius;
    }
}