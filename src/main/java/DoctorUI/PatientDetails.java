package DoctorUI;

import javax.swing.*;
import java.awt.*;

public class PatientDetails extends JPanel {
    private JLabel patientName = new JLabel("Daphne Von Oram");
    private JLabel patientAge = new JLabel("62");

    public PatientDetails(){
        JPanel pd = new JPanel();
        pd.setLayout(new GridLayout(3, 1));
        patientName.setText("Daphne Von Oram");
        patientAge.setText("62");
        pd.add(patientName);
        pd.add(patientAge);
        add(pd);
    }
}
