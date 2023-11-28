import DoctorUI.UserInterface;
import PatientData.Patient;
import jdk.vm.ci.meta.Local;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        UserInterface ui = new UserInterface();
        Patient patient1=new Patient("John Barking",65, "https://martinh.netfirms.com/BIOE60010/DaphneVonOram.jpg", "https://martinh.netfirms.com/BIOE60010/mri1.jpg", 2, LocalDate.of(2023,9,14), 130, 70, LocalDate.of(2023,9,15), "ST");
        Patient patient2=new Patient("Sebastian Compton",31, "https://martinh.netfirms.com/BIOE60010/SebastianCompton.jpg", "https://martinh.netfirms.com/BIOE60010/mri2.jpg", 4, LocalDate.of(2023,11,19), 150, 80, LocalDate.of(2023, 11, 20), "VST");

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