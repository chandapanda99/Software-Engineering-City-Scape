/**
 * Write a description of class MoveY here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import javax.swing.*;
import java.awt.event.*;
public class MoveY extends AbstractAction
{
    /** description of instance variable x (add comment for each instance variable) */
    private int dy;
    
    public MoveY()
    {
        // initialise instance variables
        dy = 0;
    }

    public void actionPerformed(ActionEvent e)
    {
        Paddle temp = (Paddle)e.getSource();
    }
}
