import java.awt.*;
import java.applet.*;

public class MovingImage extends Applet
{
    Image picture;

    public void init()
    {
        picture = getImage(getDocumentBase(), "bike.gif");
    }

    public void paint(Graphics g)
    {
        for(int i = 0; i < 500; i++)
            g.drawImage(picture, i, 30, this);

        try
        {
            Thread.sleep(100);
        }
        catch(Exception e) {}
    }
}

/*
 * <applet code="MovingImage" width=800 height=600>
 * </applet>
 * */
