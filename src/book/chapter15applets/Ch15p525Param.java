package book.chapter15applets;

import java.applet.Applet;
import java.awt.*;

/*
<applet code="MouseEvents" width=300 hight=100>
    <param name=author value="Aleksandr Butorin">
    <param name=appletName value="MouseEvents">
    <param name=version value=1>
</applet>
*/

public class Ch15p525Param extends Applet {

    String author;
    String appletName;
    int version;

    @Override
    public void start() {
        resize(new Dimension(300, 400));

        author = getParameter("author");
        if (author == null) author = "unknown";

        appletName = getParameter("appletName");
        if (appletName == null) appletName = "unnamed";

        String v = getParameter("version");
        try {
            version = Integer.parseInt(v);
        } catch (NumberFormatException nfe) {
            version = -1;
        }
    }

    @Override
    public void paint(Graphics g) {
        g.drawString(appletName, 10, 20);
        g.drawString("by: " + author, 10, 40);
        g.drawString("version: " + version, 10, 60);

        showStatus("Status is relaxed");
    }
}
