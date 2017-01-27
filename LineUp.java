//********************************************************************
//  LineUp.java       Author: Lewis/Loftus/Cocking
//
//  Demonstrates the use of a graphical object.
//********************************************************************

import java.util.Random;
import java.applet.Applet;
import java.awt.*;

public class LineUp extends Applet
{
   private final int APPLET_WIDTH = 400;
   private final int APPLET_HEIGHT = 150;
   private final int HEIGHT_MIN = 100;
   private final int VARIANCE = 40;

   private StickFigure figure1, figure2, figure3, figure4, figure5, figure6, figure7;
   Random generator = new Random();
   //-----------------------------------------------------------------
   //  Creates several stick figures with varying characteristics.
   //  init is like the constructor
   //-----------------------------------------------------------------
   public void init ()
   {
      int h1, h2, h3, h4, h5, h6, h7;  // heights of stick figures
      
      h1 = HEIGHT_MIN + generator.nextInt(VARIANCE);
      h2 = HEIGHT_MIN + generator.nextInt(VARIANCE);
      h3 = HEIGHT_MIN + generator.nextInt(VARIANCE);
      h4 = HEIGHT_MIN + generator.nextInt(VARIANCE);
      h5 = HEIGHT_MIN + generator.nextInt(VARIANCE);
      h6 = HEIGHT_MIN + generator.nextInt(VARIANCE);
      h7 = HEIGHT_MIN + generator.nextInt(VARIANCE);


      figure1 = new StickFigure (150, 250, new Color(generator.nextInt(256), generator.nextInt(256), generator.nextInt(256)), h1);
      figure2 = new StickFigure (200, 250, new Color(generator.nextInt(256), generator.nextInt(256), generator.nextInt(256)), h2);
      figure3 = new StickFigure (250, 250, new Color(generator.nextInt(256), generator.nextInt(256), generator.nextInt(256)), h3);
      figure4 = new StickFigure (300, 250, new Color(generator.nextInt(256), generator.nextInt(256), generator.nextInt(256)), h4);
      figure5 = new StickFigure (350, 250, new Color(generator.nextInt(256), generator.nextInt(256), generator.nextInt(256)), h5);
      figure6 = new StickFigure (400, 250, new Color(generator.nextInt(256), generator.nextInt(256), generator.nextInt(256)), h6);
      figure7 = new StickFigure (450, 250, new Color(generator.nextInt(256), generator.nextInt(256), generator.nextInt(256)), h7);


      setBackground (new Color(generator.nextInt(256), generator.nextInt(256), generator.nextInt(256)));
      setSize (APPLET_WIDTH, APPLET_HEIGHT);
   }

   //-----------------------------------------------------------------
   //  Paints the stick figures on the applet.
   //-----------------------------------------------------------------
   public void paint (Graphics page)
   {

      figure1.draw (page);
      figure2.draw (page);
      figure3.draw (page);
      figure4.draw (page);
      figure5.draw (page);
      figure6.draw (page);
      figure7.draw (page);
      
      
      
      try {Thread.sleep(100);
      }
      catch (InterruptedException e) {}
      
      figure1.setHeight(HEIGHT_MIN + generator.nextInt(VARIANCE));
      figure2.setHeight(HEIGHT_MIN + generator.nextInt(VARIANCE));
      figure3.setHeight(HEIGHT_MIN + generator.nextInt(VARIANCE));
      figure4.setHeight(HEIGHT_MIN + generator.nextInt(VARIANCE));
      figure5.setHeight(HEIGHT_MIN + generator.nextInt(VARIANCE));
      figure6.setHeight(HEIGHT_MIN + generator.nextInt(VARIANCE));
      figure7.setHeight(HEIGHT_MIN + generator.nextInt(VARIANCE));
      repaint();
   }
}