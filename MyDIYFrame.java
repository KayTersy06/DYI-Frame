package za.ac.tut.ui;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author kayte
 */
public class MyDIYFrame extends JFrame {

    public MyDIYFrame() {
        setTitle("Siphesihle Xolani Skosana");
        setSize(300, 350);
        setDefaultLookAndFeelDecorated(true);
        setResizable(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setForeground(Color.red);
        setVisible(true);
    }   
}
