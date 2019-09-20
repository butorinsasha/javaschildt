package book.chapter16swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.awt.FlowLayout.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Ch16p554ButtonDemo {

    JLabel jlab;

    Ch16p554ButtonDemo() {

        JFrame jfrm = new JFrame("A button Example");

        //Specify FlowLayout for the layout manager.
        FlowLayout layout = new FlowLayout(CENTER, 10, 10);
        jfrm.setLayout(layout);

        jfrm.setSize(300, 100);

        jfrm.setDefaultCloseOperation(EXIT_ON_CLOSE);

        JButton jbtnUp = new JButton("Up");
        JButton jbtnDown = new JButton("Down");

        jbtnUp.addActionListener((ae) -> jlab.setText("You pressed Up"));
        jbtnDown.addActionListener((ae) -> jlab.setText("You pressed Down"));

        jfrm.add(jbtnUp);
        jfrm.add(jbtnDown);

        jlab = new JLabel("Press a button.");

        jfrm.add(jlab);

        jfrm.setVisible(true);

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Ch16p554ButtonDemo());
    }
}
