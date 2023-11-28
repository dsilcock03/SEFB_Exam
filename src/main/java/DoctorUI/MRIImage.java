package DoctorUI;

import javax.swing.*;
import java.net.MalformedURLException;
import java.net.URL;

public class MRIImage extends JPanel {

    public MRIImage() {
        JLabel mriImage = new JLabel();
        URL imageURL = null;
        try {
            imageURL = new URL("https://martinh.netfirms.com/BIOE60010/mri1.jpg");
        } catch (MalformedURLException e) {
            System.out.println(e.getMessage());
        }
        ImageIcon thisImageIcon = new ImageIcon(imageURL);
        mriImage.setIcon(thisImageIcon);

        add(mriImage);

    }
}
