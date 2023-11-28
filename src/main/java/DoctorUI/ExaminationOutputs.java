package DoctorUI;

import javax.swing.*;
import java.awt.*;

public class ExaminationOutputs extends JPanel {
    private int systolicPressure = 130;
    private int diastolicPressure = 70;
    private JLabel bloodPressure = new JLabel();

    public ExaminationOutputs(){
        JPanel eo = new JPanel();
        eo.setLayout(new GridLayout(3, 1));
        bloodPressure.setText(systolicPressure+" over "+diastolicPressure);
        eo.add(bloodPressure);
        add(eo);
    }
}