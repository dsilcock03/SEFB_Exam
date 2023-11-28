package DoctorUI;

import javax.swing.*;
import java.net.MalformedURLException;
import java.net.URL;

public class PatientImage extends JPanel {

    public PatientImage(){
        JLabel patientImage = new JLabel();
        URL imageURL=null;
        try {
            imageURL = new URL("https://martinh.netfirms.com/BIOE60010/DaphneVonOram.jpg");
        }
        catch (MalformedURLException e){
            System.out.println(e.getMessage());
        }
        ImageIcon thisImageIcon = new ImageIcon(imageURL);
        patientImage.setIcon(thisImageIcon);

        add(patientImage);

    }
}
