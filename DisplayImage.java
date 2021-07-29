import java.awt.*;
import java.applet.*;

public class DisplayImage extends Applet
{
    Image[] picture = new Image[5];

    public void init()
    {
        for (int i = 0; i < 5; i++)
        {
            picture[i] = getImage(getDocumentBase(), "000" + (i+1) + ".jpg");
        }
    }

    public void paint(Graphics g)
    {
        int x = 0, y = 0;
        for (int i = 0; i < 5; i++)
        {
            g.drawImage(picture[i], x, y, this);
            x += 50;
            y += 75;
        }
    }
}

/*
 * <applet code="DisplayImage" width=800 height=600>
 * </applet>
 * */
