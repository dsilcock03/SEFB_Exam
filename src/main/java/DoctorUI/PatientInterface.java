package DoctorUI;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class PatientInterface extends JPanel {
    private JPanel patientPanel = new JPanel();
    private PatientDetails patientDetails = new PatientDetails();
    private ExaminationOutputs examinationOutputs = new ExaminationOutputs();
    private PatientImage patientImage = new PatientImage();

    public PatientInterface(){
        patientPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
        patientPanel.setLayout(new GridLayout(1, 4));

        patientPanel.add(patientImage);
        patientPanel.add(patientDetails);
        patientPanel.add(examinationOutputs);
        add(patientPanel);
    }
    public JPanel getPatientPanel(){
        return patientPanel;
    }
}
