package book.chapter15applets;

import java.applet.*;
import java.awt.*;

/*
<applet code="Banner" width=300 height=50>
</applet>
*/

public class Banner extends Applet implements Runnable{

    String msg = " Java Rules the Web ";
    Thread t;
    boolean stopFlag;

    // Called first. Class variables initialization
    @Override
    public void init() {
        System.out.println("***[1] init()***");
        t = null;
    }

    // Called second, after init(). Start or resume execution
    @Override
    public void start() {
        System.out.println("***[2] start()***");
        t = new Thread(this);
        stopFlag = false;
        t.start();
    }


    // Runnable interface method run() must be implemented
    @Override
    public void run() {
        for ( ; ; ) {
            try {
                repaint();
                Thread.sleep(250);
                if (stopFlag)
                    break;
            } catch (InterruptedException e) {
            e.printStackTrace();
            }
        }
    }

    // Called when an AWT-based apple's window must be restored. Redisplay contents of window
    public void paint (Graphics g) {
        System.out.println("***[3] paint()***");
        char ch;

        ch = msg.charAt(0);
        msg = msg.substring(1, msg.length());
        msg += ch;
        g.drawString(msg, 50, 30);
    }



    // Called when applet is stopped (suspends execution)
    @Override
    public void stop() {
        System.out.println("***[4] stop()***");
        stopFlag = true;
        t = null;

    }

    // Called when applet is terminated. This is the last method executed
    @Override
    public void destroy() {
        System.out.println("***[5] destroy()***");
        stopFlag = true;
        t = null;
    }


}
