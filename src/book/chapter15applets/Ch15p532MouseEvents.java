package book.chapter15applets;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class Ch15p532MouseEvents extends Applet implements MouseListener, MouseMotionListener {

    String msg = "";
    int mouseX = 0;
    int mouseY = 0;

    @Override
    public void init() {
        addMouseListener(this);
        addMouseMotionListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        mouseX = me.getX();
        mouseX = me.getY();
        msg = ".";
        repaint();
        showStatus("Mouse clicked at " + mouseX + ", " + mouseY);
    }

    @Override
    public void mousePressed(MouseEvent me) {
        mouseX = me.getX();
        mouseX = me.getY();
        msg = "x";
        showStatus("Mouse pressed at " + mouseX + ", " + mouseY);
        repaint();
    }

    @Override
    public void mouseReleased(MouseEvent me) {
        mouseX = me.getX();
        mouseX = me.getY();
        msg = "o";
        showStatus("Mouse released at " + mouseX + ", " + mouseY);
        repaint();
    }

    @Override
    public void mouseEntered(MouseEvent me) {
        mouseX = 0;
        mouseX = 10;
        msg = "Mouse entered";
        repaint();
    }

    @Override
    public void mouseExited(MouseEvent me) {
        mouseX = 0;
        mouseX = 10;
        msg = "Mouse exited";
        repaint();
    }

    @Override
    public void mouseDragged(MouseEvent me) {
        mouseX = me.getX();
        mouseY = me.getY();
        msg = "*";
        showStatus("Dragging mouse at " + mouseX + ", " + mouseY );
        repaint();
    }

    @Override
    public void mouseMoved(MouseEvent me) {
            showStatus("Moving mouse at " + mouseX + ", " + mouseY );
    }

    @Override
    public void paint(Graphics g) {
        g.drawString(msg, mouseX, mouseY);
    }
}
