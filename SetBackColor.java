import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
                
public class SetBackColor extends Applet {
                      
      public void init() 
      {
            setBackground(Color.cyan);
            setForeground(Color.red);
      }
      public void paint(Graphics g)
      {
          g.drawString("Good Morning", 50, 50);
      }
} 
    /* 
     *     <applet code="SetBackColor" width=200 height=200>
     *         </applet>
     *             */
