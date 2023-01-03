package panels;

import javax.swing.*;
import java.awt.*;

public class TopPanel extends SidePanel {

    public TopPanel(){
        this.setBounds(550,40,300,250);
        ImageIcon icon = new ImageIcon("src/images/avatars.jpg");
        JLabel label = new JLabel("Avatars");
        label.setIcon(icon);
        this.add(label);
    }
}
