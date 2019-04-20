package book.chapter16swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Ch16p554ButtonDemo implements ActionListener {

    JLabel jlab;

    Ch16p554ButtonDemo() {

        JFrame jfrm = new JFrame("A button Example");

        //Specify FlowLayout for the layout manager.
        jfrm.setLayout(new FlowLayout());

        jfrm.setSize(1000, 300);

        jfrm.setDefaultCloseOperation(EXIT_ON_CLOSE);

        JButton jbtnUp = new JButton("Up");
        JButton jbtnDown = new JButton("Down");

        jbtnUp.addActionListener(this);
        jbtnDown.addActionListener(this);

        jfrm.add(jbtnUp);
        jfrm.add(jbtnDown);

        jlab = new JLabel("Press a button.");

        jfrm.add(jlab);

        jfrm.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getActionCommand().equals("Up"))
            jlab.setText("You pressed Up" + " " + this.toString());
        else
            jlab.setText("You pressed Down" + " " + this.toString());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Ch16p554ButtonDemo());
    }
}
