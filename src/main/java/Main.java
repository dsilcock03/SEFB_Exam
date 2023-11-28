import DoctorUI.UserInterface;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Main {
    public static void main(String[] args){
        UserInterface ui = new UserInterface();

        JFrame frame = new JFrame(); // Create a new frame
        frame.setSize(800,400); // Set frame Size
        frame.setLayout(new GridLayout(1,2)); // Splits frame into sections
        frame.setVisible(true);
        frame.add(ui.getMainPanel());

        frame.addWindowListener(new WindowAdapter() { // Closes the program if close window clicked
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });
    }
}