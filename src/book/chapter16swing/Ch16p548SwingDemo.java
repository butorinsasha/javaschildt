package book.chapter16swing;

import javax.swing.*;

public class Ch16p548SwingDemo {

    JFrame jfrm;

    Ch16p548SwingDemo() {

        // Create a new JFrame container.
        jfrm = new JFrame("A Simple Swing Application");

        // Give the frame an initial size.
        jfrm.setSize(275, 100);

        // Terminate the program when the user closes the application.
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a text-basef label (also can consit of an icon)
        JLabel jlab = new JLabel(" Swing defines the modern Java GUI.");

        // Add the label to content pane.
        jfrm.add(jlab);

        // Display the frame (default
        jfrm.setVisible(true);
    }

    public static void main(String[] args) {

        // Create the frame on the even dispatching thread
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Ch16p548SwingDemo();
            }
        });

    }

}
