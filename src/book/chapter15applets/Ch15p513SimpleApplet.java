package book.chapter15applets;

import java.applet.*;
import java.awt.*;

/*
<applet code="Ch15p513SimpleApplet" width=202 height=60>
</applet>
*/

public class Ch15p513SimpleApplet extends Applet {
    public void paint(Graphics g) {
        g.drawString("Java makes applets easy.", 20, 20);
    }
}
