package DoctorUI;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class UserInterface {
    private JPanel mainPanel = new JPanel();
    private PatientInterface patientPanel1 = new PatientInterface();

    public UserInterface(){
        mainPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
        mainPanel.setLayout(new GridLayout(2, 1));

        mainPanel.add(patientPanel1);
    }
    public JPanel getMainPanel(){
        return mainPanel;
    }

}
